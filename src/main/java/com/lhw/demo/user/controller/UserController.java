package com.lhw.demo.user.controller;

import com.lhw.demo.user.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @RequestMapping("")
    @ResponseBody
    public String users() {
        return "메인페이지";
    }

    @RequestMapping("1")
    @ResponseBody
    public User user() {
        User user = new User();
        return user;
    }
}
