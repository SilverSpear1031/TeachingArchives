package com.ruipeng.service;

import com.ruipeng.dao.mapper.AuthorityTaMapper;
import com.ruipeng.dao.mapper.UserTaMapper;
import com.ruipeng.pojo.AuthorityTa;
import com.ruipeng.pojo.AuthorityTaExample;
import com.ruipeng.pojo.EasyuiPageParam;
import com.ruipeng.pojo.UserTaExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ruipeng on 2018/5/13.
 * 权限管理
 */
@Service
public class AuthorityManagerServiceImpl implements AuthorityManagerService{
    @Resource
    private AuthorityTaMapper authorityTaMapper;

    @Override
    public EasyuiPageParam authorityList(AuthorityTa authorityTa, Integer page, Integer rows) {
        AuthorityTaExample authorityTaExample = new AuthorityTaExample();
        AuthorityTaExample.Criteria criteria = authorityTaExample.createCriteria();

        //根据权限类别或学院模糊查询
        if ((authorityTa.getUserauthority() != null && !authorityTa.getUserauthority().trim().isEmpty()) || (authorityTa.getAcademy() != null && !authorityTa.getAcademy().trim().isEmpty())) {
            //双重模糊
            if ((authorityTa.getUserauthority() != null && !authorityTa.getUserauthority().trim().isEmpty()) && (authorityTa.getAcademy() != null && !authorityTa.getAcademy().trim().isEmpty())) {
                criteria.andUserauthorityLike("%" + authorityTa.getUserauthority() + "%");
                criteria.andAcademyLike("%" + authorityTa.getAcademy() + "%");

                //仅模糊权限类别
            } else if (authorityTa.getUserauthority() != null && !authorityTa.getUserauthority().trim().isEmpty()) {
                criteria.andUserauthorityLike("%" + authorityTa.getUserauthority() + "%");

                //仅模糊姓名
            } else if (authorityTa.getAcademy() != null && !authorityTa.getAcademy().trim().isEmpty()) {
                criteria.andAcademyLike("%" + authorityTa.getAcademy() + "%");

            }
        } else {     //初始化
            Integer total = authorityTaMapper.countByExample(authorityTaExample);
            authorityTaExample.setStartNum(0);  //第一个数据起始点
            authorityTaExample.setAddNum(15);

            List dataTa = authorityTaMapper.selectByExample(authorityTaExample);
            return new EasyuiPageParam(dataTa, total);   //返回页面参数
        }

        Integer total = authorityTaMapper.countByExample(authorityTaExample);
        authorityTaExample.setStartNum(rows * (page - 1));  //第一个数据起始点
        authorityTaExample.setAddNum(rows);

        List dataTa = authorityTaMapper.selectByExample(authorityTaExample);
        return new EasyuiPageParam(dataTa, total);   //返回页面参数
    }

    @Override
    public Integer authorityDelete(String ids) {
        AuthorityTaExample authorityTaExample = new AuthorityTaExample();
        AuthorityTaExample.Criteria criteria = authorityTaExample.createCriteria();

        List idsList = Arrays.asList(ids.split(","));        //字符串到数组再到list
        criteria.andUserauthorityIn(idsList);
        int successNum = authorityTaMapper.deleteByExample(authorityTaExample);
        return successNum;
    }

    @Override
    public Integer authorityAdd(AuthorityTa authorityTa) {
        return authorityTaMapper.insert(authorityTa);
    }

    @Override
    public Integer authorityUpdate(AuthorityTa authorityTa) {
        AuthorityTaExample authorityTaExample = new AuthorityTaExample();
        AuthorityTaExample.Criteria criteria = authorityTaExample.createCriteria();

        criteria.andUserauthorityEqualTo(authorityTa.getUserauthority());
        return authorityTaMapper.updateByExample(authorityTa,authorityTaExample);
    }
}
