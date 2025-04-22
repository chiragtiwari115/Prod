package com.ct.product.Controller;

import com.ct.product.Service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return loginService.login(username, password);
    }

}
