package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.JeeMainsCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jee-mains")
@CrossOrigin(origins = "http://localhost:5173") // Allow React frontend
public class JeeMainsCollegeController {

    @Autowired
    private JeeMainsCollegeService service;

    @PostMapping("/eligible-colleges")
    public List<JeeMainsCollegeDto> getEligibleColleges(@RequestBody CollegeFilterRequest req) {
        return service.getEligibleColleges(req);
    }
}
