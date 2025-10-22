package com.example.demo.controller;

import com.example.demo.model.SubjectData;
import com.example.demo.service.SubjectWeightageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subject-weightage")
public class SubjectWeightageController {

    private final SubjectWeightageService subjectWeightageService;

    public SubjectWeightageController(SubjectWeightageService subjectWeightageService) {
        this.subjectWeightageService = subjectWeightageService;
    }

    @GetMapping
    public List<SubjectData> getSubjectData(@RequestParam String exam) {
        return subjectWeightageService.getSubjectData(exam);
    }
}
