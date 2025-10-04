package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @PostMapping
    public ResponseEntity<String> updateProfile(@RequestBody UserProfile userProfile) {
        // In a real application, you would save this to a database and
        // associate it with the currently logged-in user.
        System.out.println("Updating profile with data: " + userProfile);

        // You can add your business logic here to save the profile data

        return ResponseEntity.ok("Profile updated successfully");
    }
}
