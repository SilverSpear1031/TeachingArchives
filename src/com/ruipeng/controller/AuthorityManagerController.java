package com.ruipeng.controller;

import com.ruipeng.pojo.AuthorityTa;
import com.ruipeng.pojo.EasyuiPageParam;
import com.ruipeng.service.AuthorityManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by ruipeng on 2018/5/13.
 * 权限管理
 */
@RestController
public class AuthorityManagerController {
    @Resource
    private AuthorityManagerService authorityManagerService;

    @RequestMapping(value = "/authorityList", produces = "application/json;charset=utf8")
    @ResponseBody
    public EasyuiPageParam authorityList(AuthorityTa authorityTa, Integer page, Integer rows)  {
        return authorityManagerService.authorityList(authorityTa,page,rows);
    }

    @RequestMapping(value = "/authorityDelete", produces = "application/json;charset=utf8")
    @ResponseBody
    public Integer authorityDelete(String ids){
        return authorityManagerService.authorityDelete(ids);
    }

    @RequestMapping(value = "/authorityAdd", produces = "application/json;charset=utf8")
    @ResponseBody
    public Integer authorityAdd(AuthorityTa authorityTa){
        return authorityManagerService.authorityAdd(authorityTa);
    }

    @RequestMapping(value = "/authorityUpdate", produces = "application/json;charset=utf8")
    @ResponseBody
    public Integer authorityUpdate(AuthorityTa authorityTa){
        return authorityManagerService.authorityUpdate(authorityTa);
    }
}
