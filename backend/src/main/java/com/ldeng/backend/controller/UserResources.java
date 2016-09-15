package com.ldeng.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gadav on 15/09/2016.
 */

@RestController
@RequestMapping("/rest")
public class UserResources {
    @RequestMapping("user/users")
    public String loginSucess() {
        return "Login Sucessful!";
    }
}
