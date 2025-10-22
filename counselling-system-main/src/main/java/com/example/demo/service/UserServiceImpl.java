package com.example.demo.service;

import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        System.out.println("Registering user: " + user.getEmail());
        User savedUser = userRepository.save(user);

        // Generate registration number
        String registrationNumber = generateRegistrationNumber(savedUser.getId());
        savedUser.setRegistrationNumber(registrationNumber);

        // Save again to store registration number
        savedUser = userRepository.save(savedUser);

        return savedUser;
        //return userRepository.save(user); // ✅ saves user in DB
    }

    private String generateRegistrationNumber(Long id) {
        int year = java.time.Year.now().getValue();
        long countForYear = userRepository.countByRegistrationNumberStartingWith(String.valueOf(year));
        long nextNumber = countForYear + 1;
        return String.format("%dCRN%06d", year, nextNumber);
    }

    @Override
    public LoginResponse loginUser(LoginRequest loginRequest) {
        return userRepository.findByEmail(loginRequest.getEmail())
                .map(user -> {
                    if (user.getPassword().equals(loginRequest.getPassword())) {
                        return new LoginResponse(true, "Login successful!",user);
                    } else {
                        return new LoginResponse(false, "Invalid credentials.");
                    }
                })
                .orElse(new LoginResponse(false, "Invalid credentials."));
    }

}