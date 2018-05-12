package com.ruipeng.controller;

import com.ruipeng.pojo.EasyuiPageParam;
import com.ruipeng.pojo.UserTa;
import com.ruipeng.service.UserManagerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ruipeng on 2018/5/12.
 */
@RestController
public class UserManagerController {
    private String homepage_Path="/index.html";
    private String userLogin_Path="/custom/jsp/userLogin.jsp";

    @Resource
    private UserManagerService userManagerService;

    @RequestMapping(value = "/userList", produces = "application/json;charset=utf8")
    @ResponseBody
    public EasyuiPageParam userList(UserTa userTa, Integer page,Integer rows)  {
        return userManagerService.userList(userTa,page,rows);
    }

    @RequestMapping(value = "/userDelete", produces = "application/json;charset=utf8")
    public void userDelete(HttpServletRequest request, HttpServletResponse response, UserTa userTa, Model model){

    }
}
