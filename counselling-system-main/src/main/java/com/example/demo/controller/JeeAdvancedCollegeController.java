package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.JeeAdvancedCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jee-advanced")
@CrossOrigin(origins = "http://localhost:5173") // Allow React frontend
public class JeeAdvancedCollegeController {

    @Autowired
    private JeeAdvancedCollegeService service;

    @PostMapping("/eligible-colleges")
    public List<JeeAdvancedCollegeDto> getEligibleColleges(@RequestBody CollegeFilterRequest req) {
        return service.getEligibleColleges(req);
    }
}
