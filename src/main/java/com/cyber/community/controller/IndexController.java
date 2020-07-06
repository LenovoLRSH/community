package com.cyber.community.controller;

import com.cyber.community.mapper.UserMapper;
import com.cyber.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request){

        Cookie[] cookies = request.getCookies();
        if (cookies == null && cookies.length == 0){
            return "index";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if (user != null){
                    System.out.println(user.toString());
                    request.getSession().setAttribute("user", user);
                }
                break;
            }
        }

        return "index";
    }
}
