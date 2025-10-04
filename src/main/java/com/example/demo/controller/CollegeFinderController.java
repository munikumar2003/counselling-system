package com.example.demo.controller;

import com.example.demo.model.College;
import com.example.demo.model.CollegeFinderRequest;
import com.example.demo.model.CollegeFinderResponse;
import com.example.demo.service.CollegeFinderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class CollegeFinderController {

    private final CollegeFinderService collegeFinderService;

    public CollegeFinderController(CollegeFinderService collegeFinderService) {
        this.collegeFinderService = collegeFinderService;
    }

    @PostMapping("/find")
    public CollegeFinderResponse findColleges(@RequestBody CollegeFinderRequest request) {
        List<College> colleges = collegeFinderService.findColleges(request);
        return new CollegeFinderResponse(colleges);
    }
}
