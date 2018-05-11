package com.ruipeng.controller;

import com.ruipeng.pojo.UserTa;
import com.ruipeng.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ruipeng on 2018/5/11.
 */
@RestController
public class UserManagerController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/userLogin", produces = "application/json;charset=utf8")
    public void userLogin(HttpServletRequest request, HttpServletResponse response, UserTa userTa, Model model) throws IOException {
        UserTa userTa1 = userService.queryUserTa(userTa);
        if (userTa1 != null) {
            request.getSession().setAttribute("userName", userTa1.getUsername());
            request.getSession().setAttribute("userAccount", userTa1.getUseraccount());
            request.getSession().setAttribute("userAuthority", userTa1.getUserauthority());

            if (request.getParameter("autoLogin") != null) {      //自动登录
                Cookie cookie1 = new Cookie("userName", userTa1.getUsername());
                Cookie cookie2 = new Cookie("userAccount", userTa1.getUseraccount());
                Cookie cookie3 = new Cookie("userAuthority", userTa1.getUserauthority());
                cookie1.setMaxAge(30 * 24 * 60 * 60);
                cookie2.setMaxAge(30 * 24 * 60 * 60);
                cookie3.setMaxAge(30 * 24 * 60 * 60);
                response.addCookie(cookie1);
                response.addCookie(cookie2);
                response.addCookie(cookie3);

            } else {    //如果没选择自动登录，需要清除自动登录的cookie
                Cookie cookie1 = new Cookie("userName", null);
                Cookie cookie2 = new Cookie("userAccount", null);
                Cookie cookie3= new Cookie("userAuthority", null);
                cookie1.setMaxAge(0);
                cookie2.setMaxAge(0);
                cookie3.setMaxAge(0);
                response.addCookie(cookie1);
                response.addCookie(cookie2);
                response.addCookie(cookie3);
            }

                response.sendRedirect("/index.html");
        } else {
            request.getSession().setAttribute("info", "帐号或密码错误");
            response.sendRedirect("/custom/jsp/userLogin.jsp");
        }
    }
}
