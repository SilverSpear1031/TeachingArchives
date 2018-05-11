package com.ruipeng.service;

import com.ruipeng.pojo.UserTa;
import com.ruipeng.dao.mapper.UserTaMapper;
import com.ruipeng.pojo.UserTaExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ruipeng on 2018/5/11.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserTaMapper userTaMapper;

    @Override
    public UserTa queryUserTa(UserTa userTa) {
        UserTaExample userTaExample=new UserTaExample();
        UserTaExample.Criteria criteria=userTaExample.createCriteria();
        criteria.andUseraccountEqualTo(userTa.getUseraccount());
        criteria.andUserpasswordEqualTo(userTa.getUserpassword());

        List<UserTa> userTas=userTaMapper.selectByExample(userTaExample);
        if(!userTas.isEmpty()){
            return userTas.get(0);
        }else {
            return null;
        }
    }
}
