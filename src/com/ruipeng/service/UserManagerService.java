package com.ruipeng.service;

import com.ruipeng.pojo.EasyuiPageParam;
import com.ruipeng.pojo.UserTa;

/**
 * Created by ruipeng on 2018/5/12.
 */
public interface UserManagerService {
    EasyuiPageParam userList(UserTa userTa,Integer page,Integer rows);
    Integer userDelete(String ids);
    Integer userAdd(UserTa userTa);
    Integer userUpdate(UserTa userTa);
}
