package com.ruipeng.service;

import com.ruipeng.dao.mapper.UserTaMapper;
import com.ruipeng.pojo.EasyuiPageParam;
import com.ruipeng.pojo.UserTa;
import com.ruipeng.pojo.UserTaExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ruipeng on 2018/5/12.
 * 用户管理
 */
@Service
public class UserManagerServiceImpl implements UserManagerService {
    @Resource
    private UserTaMapper userTaMapper;

    @Override
    public EasyuiPageParam userList(UserTa userTa,Integer page, Integer rows) {
        UserTaExample userTaExample = new UserTaExample();
        UserTaExample.Criteria criteria = userTaExample.createCriteria();

        //根据帐号或用户名模糊查询
        if ((userTa.getUseraccount() != null && !userTa.getUseraccount().trim().isEmpty()) || (userTa.getUsername() != null && !userTa.getUsername().trim().isEmpty())) {
            //双重模糊
            if ((userTa.getUseraccount() != null && !userTa.getUseraccount().trim().isEmpty()) && (userTa.getUsername() != null && !userTa.getUsername().trim().isEmpty())) {
                criteria.andUseraccountLike("%" + userTa.getUseraccount() + "%");
                criteria.andUsernameLike("%" + userTa.getUsername() + "%");

                //仅模糊帐号
            } else if (userTa.getUseraccount() != null && !userTa.getUseraccount().trim().isEmpty()) {
                criteria.andUseraccountLike("%" + userTa.getUseraccount() + "%");

                //仅模糊姓名
            } else if (userTa.getUsername() != null && !userTa.getUsername().trim().isEmpty()) {
                criteria.andUsernameLike("%" + userTa.getUsername() + "%");

            }
        } else {     //初始化
            Integer total = userTaMapper.countByExample(new UserTaExample());
            userTaExample.setStartNum(0);  //第一个数据起始点
            userTaExample.setAddNum(15);

            List dataTa = userTaMapper.selectByExample(userTaExample);
            return new EasyuiPageParam(dataTa, total);   //返回页面参数
        }

        Integer total = userTaMapper.countByExample(userTaExample);
        userTaExample.setStartNum(rows * (page - 1));  //第一个数据起始点
        userTaExample.setAddNum(rows);

        List dataTa = userTaMapper.selectByExample(userTaExample);
        return new EasyuiPageParam(dataTa, total);   //返回页面参数
    }

    @Override
    public Integer userDelete(String ids) {
        UserTaExample userTaExample = new UserTaExample();
        UserTaExample.Criteria criteria = userTaExample.createCriteria();

        List idsList = Arrays.asList(ids.split(","));        //字符串到数组再到list
        criteria.andUseraccountIn(idsList);
        int successNum = userTaMapper.deleteByExample(userTaExample);
        return successNum;
    }

    @Override
    public Integer userAdd(UserTa userTa) {
        return userTaMapper.insert(userTa);
    }

    @Override
    public Integer userUpdate(UserTa userTa) {
        UserTaExample userTaExample = new UserTaExample();
        UserTaExample.Criteria criteria = userTaExample.createCriteria();

        criteria.andUseraccountEqualTo(userTa.getUseraccount());
        return userTaMapper.updateByExample(userTa,userTaExample);
    }
}
