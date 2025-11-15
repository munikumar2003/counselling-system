package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.CatCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin(origins = "http://localhost:5173") // Allow React frontend
public class CatCollegeController {

    @Autowired
    private CatCollegeService service;

    @PostMapping("/eligible-colleges")
    public List<CatCollegeDto> getEligibleColleges(@RequestBody CollegeFilterRequest req) {
        return service.getEligibleColleges(req);
    }
}
