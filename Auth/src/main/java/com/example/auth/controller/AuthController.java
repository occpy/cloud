package com.example.auth.controller;

import cn.dev33.satoken.util.SaResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthController {


    @GetMapping("doLogin")
    public SaResult Login() {
        return SaResult.ok("登录功能");
    }
}
