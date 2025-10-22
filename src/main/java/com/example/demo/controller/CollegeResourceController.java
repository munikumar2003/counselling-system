package com.example.demo.controller;

import com.example.demo.model.CollegeResource;
import com.example.demo.service.CollegeResourceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/collegeresources")
public class CollegeResourceController {

    private final CollegeResourceService collegeResourceService;

    public CollegeResourceController(CollegeResourceService collegeResourceService) {
        this.collegeResourceService = collegeResourceService;
    }

    @GetMapping
    public List<CollegeResource> getAllCollegeResources() {
        return collegeResourceService.getAllCollegeResources();
    }
}
