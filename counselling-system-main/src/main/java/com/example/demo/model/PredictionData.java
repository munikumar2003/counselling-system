package com.example.demo.model;

public class PredictionData {
    private String exam;
    private double currentScore;
    private double targetScore;
    private long currentRank;
    private long predictedRank;
    private double improvement;
    private double difficulty;
    private double competition;

    // Getters and Setters

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    public double getTargetScore() {
        return targetScore;
    }

    public void setTargetScore(double targetScore) {
        this.targetScore = targetScore;
    }

    public long getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(long currentRank) {
        this.currentRank = currentRank;
    }

    public long getPredictedRank() {
        return predictedRank;
    }

    public void setPredictedRank(long predictedRank) {
        this.predictedRank = predictedRank;
    }

    public double getImprovement() {
        return improvement;
    }

    public void setImprovement(double improvement) {
        this.improvement = improvement;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getCompetition() {
        return competition;
    }

    public void setCompetition(double competition) {
        this.competition = competition;
    }
}
