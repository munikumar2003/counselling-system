package com.example.demo.controller;

import com.example.demo.model.PredictionData;
import com.example.demo.service.RankPredictorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rank-predictor")
public class RankPredictorController {

    private final RankPredictorService rankPredictorService;

    public RankPredictorController(RankPredictorService rankPredictorService) {
        this.rankPredictorService = rankPredictorService;
    }

    @GetMapping
    public PredictionData getPrediction(@RequestParam String exam, @RequestParam double currentScore, @RequestParam double targetScore) {
        return rankPredictorService.getPrediction(exam, currentScore, targetScore);
    }
}
