package com.example.demo.controller;

import com.example.demo.model.College;
import com.example.demo.model.ExamScore;
import com.example.demo.service.MultiExamPredictorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/multi-exam-predictor")
public class MultiExamPredictorController {

    private final MultiExamPredictorService multiExamPredictorService;

    public MultiExamPredictorController(MultiExamPredictorService multiExamPredictorService) {
        this.multiExamPredictorService = multiExamPredictorService;
    }

    @PostMapping("/predict")
    public List<College> predictColleges(@RequestBody List<ExamScore> examScores) {
        return multiExamPredictorService.predictColleges(examScores);
    }
}
