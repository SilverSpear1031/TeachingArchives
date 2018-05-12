package com.ruipeng.controller;

import com.ruipeng.pojo.UserTa;
import com.ruipeng.service.UserService;
import org.springframework.beans.factory.annotation.Value;
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
    private String homepage_Path="/index.html";
    private String userLogin_Path="/custom/jsp/userLogin.jsp";

    @Resource
    private UserService userService;

    @RequestMapping(value = "/userLogin", produces = "application/json;charset=utf8")
    public void userLogin(HttpServletRequest request, HttpServletResponse response, UserTa userTa, Model model) throws IOException {
        UserTa userTa1 = userService.queryUserTa(userTa);
        response.setContentType("text/html;charset=utf-8");
        if (userTa1 != null) {
            request.getSession().setAttribute("userName", userTa1.getUsername());
            request.getSession().setAttribute("userAccount", userTa1.getUseraccount());
            request.getSession().setAttribute("userAuthority", userTa1.getUserauthority());

            if (request.getParameter("autoLogin") != null) {      //自动登录
                Cookie cookie1 = new Cookie("userAccount", userTa1.getUseraccount());
                cookie1.setMaxAge(30 * 24 * 60 * 60);
                response.addCookie(cookie1);

            } else {    //如果没选择自动登录，需要清除自动登录的cookie
                Cookie cookie1 = new Cookie("userAccount", null);
                cookie1.setMaxAge(0);
                response.addCookie(cookie1);
            }

                response.sendRedirect(homepage_Path);
        } else {
            request.getSession().setAttribute("info", "帐号或密码错误");
            request.getSession().removeAttribute("userName");
            request.getSession().removeAttribute("userAccount");
            request.getSession().removeAttribute("userAuthority");
            Cookie cookie1 = new Cookie("userAccount", null);
            cookie1.setMaxAge(0);
            response.addCookie(cookie1);
            response.sendRedirect(userLogin_Path);
        }
    }

    @RequestMapping(value = "/userLogout", produces = "application/json;charset=utf8")
    public void userLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        request.getSession().removeAttribute("userName");
        request.getSession().removeAttribute("userAccount");
        request.getSession().removeAttribute("userAuthority");

        Cookie cookie1 = new Cookie("userAccount", null);
        cookie1.setMaxAge(0);
        response.addCookie(cookie1);

        response.sendRedirect(userLogin_Path);
    }
}
