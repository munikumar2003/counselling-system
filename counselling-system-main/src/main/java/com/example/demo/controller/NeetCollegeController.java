package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.NeetCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/neet")
@CrossOrigin(origins = "http://localhost:5173") // Allow React frontend
public class NeetCollegeController {

    @Autowired
    private NeetCollegeService service;

    @PostMapping("/eligible-colleges")
    public List<NeetCollegeDto> getEligibleColleges(@RequestBody CollegeFilterRequest req) {
        return service.getEligibleColleges(req);
    }
}
