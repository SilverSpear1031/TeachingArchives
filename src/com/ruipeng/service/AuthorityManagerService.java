package com.ruipeng.service;

import com.ruipeng.pojo.AuthorityTa;
import com.ruipeng.pojo.EasyuiPageParam;

/**
 * Created by ruipeng on 2018/5/13.
 */
public interface AuthorityManagerService {
    EasyuiPageParam authorityList(AuthorityTa authorityTa, Integer page, Integer rows);
    Integer authorityDelete(String ids);
    Integer authorityAdd(AuthorityTa authorityTa);
    Integer authorityUpdate(AuthorityTa authorityTa);
}
