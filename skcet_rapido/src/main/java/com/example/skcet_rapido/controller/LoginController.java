package com.example.skcet_rapido.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.skcet_rapido.model.LoginDetails;
import com.example.skcet_rapido.service.LoginService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LoginController
{
    LoginService loginService;
    LoginController(LoginService loginService)
    {
        this.loginService=loginService;
    }
    
    @GetMapping("/login/{email}/{password}")
    public String login(@PathVariable String email,@PathVariable String password) {
        if (loginService.checkLoginCredentials(email,password)) {
            System.out.print("successful login");
            return "Login successful";
        } else {
            return "Invalid email or password";
        }
    }
    


   

}
