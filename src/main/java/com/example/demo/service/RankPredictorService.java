package com.example.demo.service;

import com.example.demo.model.PredictionData;
import org.springframework.stereotype.Service;

@Service
public class RankPredictorService {

    public PredictionData getPrediction(String exam, double currentScore, double targetScore) {
        PredictionData predictionData = new PredictionData();
        predictionData.setExam(exam);
        predictionData.setCurrentScore(currentScore);
        predictionData.setTargetScore(targetScore);
        predictionData.setCurrentRank(Math.round(1000000 * Math.pow((100 - currentScore) / 100, 2)));
        predictionData.setPredictedRank(Math.round(1000000 * Math.pow((100 - targetScore) / 100, 2)));
        predictionData.setImprovement(targetScore - currentScore);
        predictionData.setDifficulty(7.5);
        predictionData.setCompetition(8.2);
        return predictionData;
    }
}
