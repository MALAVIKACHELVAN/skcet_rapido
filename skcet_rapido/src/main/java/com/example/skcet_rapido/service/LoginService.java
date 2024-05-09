package com.example.skcet_rapido.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.skcet_rapido.model.LoginDetails;
import com.example.skcet_rapido.repository.LoginRepo;

@Service
public class LoginService {
    LoginRepo loginRepo;
    LoginService(LoginRepo loginRepo)
    {
        this.loginRepo=loginRepo;
    }

    public boolean checkLoginCredentials(String email, String password) {
        LoginDetails user = loginRepo.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
