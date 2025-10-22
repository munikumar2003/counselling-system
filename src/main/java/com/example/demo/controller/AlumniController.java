package com.example.demo.controller;

import com.example.demo.model.Alumni;
import com.example.demo.service.AlumniService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alumni")
public class AlumniController {

    private final AlumniService alumniService;

    public AlumniController(AlumniService alumniService) {
        this.alumniService = alumniService;
    }

    @GetMapping
    public List<Alumni> getAlumni(@RequestParam(required = false) String college) {
        if (college != null && !college.equalsIgnoreCase("all")) {
            return alumniService.getAlumniByCollege(college);
        }
        return alumniService.getAllAlumni();
    }
}
