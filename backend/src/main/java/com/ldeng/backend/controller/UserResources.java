package com.ldeng.backend.controller;

import com.ldeng.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gadav on 15/09/2016.
 */

@RestController
@RequestMapping("/rest")
public class UserResources {
    @Autowired
    private UserService userService;

    @RequestMapping("user/users")
    public String loginSucess() {
        return "Login Sucessful!";
    }
}
