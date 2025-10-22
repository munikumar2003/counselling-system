package com.example.demo.controller;

import com.example.demo.model.DashboardData;
import com.example.demo.model.Notification;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @GetMapping
    public DashboardData getDashboardData() {
        // In a real application, you would get this data from a service
        // which would in turn get it from a database.
        User user = new User();
        user.setFirstName("John");
        user.setRegistrationNumber("123456789");
        user.setProfileComplete(false);
        user.setPaymentStatus("pending");

        List<Notification> notifications = Arrays.asList(
                new Notification(1L, "Profile Verification Required", "Please upload your 12th mark sheet for verification", "2 hours ago", "warning"),
                new Notification(2L, "Payment Confirmation", "Your payment has been received and processed", "1 day ago", "success"),
                new Notification(3L, "Choice Filling Deadline", "Last date to fill choices is 15th March 2024", "2 days ago", "info")
        );

        return new DashboardData(user, notifications);
    }
}