package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.GateCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/gate")
@CrossOrigin(origins = "http://localhost:5173") // Allow React frontend
public class GateCollegeController {

    @Autowired
    private GateCollegeService service;

    @PostMapping("/eligible-colleges")
    public List<GateCollegeDto> getEligibleColleges(@RequestBody CollegeFilterRequest req) {
        return service.getEligibleColleges(req);
    }
}
