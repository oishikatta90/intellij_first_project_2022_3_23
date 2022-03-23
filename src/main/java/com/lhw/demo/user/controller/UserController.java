package com.lhw.demo.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @RequestMapping("")
    @ResponseBody
    public String users() {
        return "Hi21222";
    }
}
