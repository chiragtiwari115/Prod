package com.ct.product.Controller;

import com.ct.product.DTO.LoginRequestDTO;
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
    public String login(@RequestBody LoginRequestDTO loginRequest) {
        return loginService.login(loginRequest.getUsername(), loginRequest.getPassword());
    }

}
