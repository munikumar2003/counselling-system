package com.example.demo.service;

import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import com.example.demo.model.User;

public interface UserService {
    User registerUser(User user);
    LoginResponse loginUser(LoginRequest loginRequest);
}
