package com.example.demo.service;

import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final Map<String, User> registeredUsers = new HashMap<>();

    @Override
    public User registerUser(User user) {
        // For now, we'll just print the user details to the console
        // and store it in the in-memory map.
        // In a real application, you would save the user to a database
        // after hashing the password.
        System.out.println("Registering user: " + user);
        registeredUsers.put(user.getEmail(), user);
        return user;
    }

    @Override
    public LoginResponse loginUser(LoginRequest loginRequest) {
        // In a real application, you would retrieve the user from the database
        // and compare the hashed password.
        User storedUser = registeredUsers.get(loginRequest.getEmail());

        if (storedUser != null && storedUser.getPassword().equals(loginRequest.getPassword())) {
            System.out.println("User logged in successfully: " + loginRequest.getEmail());
            return new LoginResponse(true, "Login successful!");
        } else {
            System.out.println("Login failed for user: " + loginRequest.getEmail());
            return new LoginResponse(false, "Invalid credentials.");
        }
    }
}
