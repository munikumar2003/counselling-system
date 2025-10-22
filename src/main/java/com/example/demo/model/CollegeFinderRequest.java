package com.example.demo.model;

import java.util.List;

public class CollegeFinderRequest {
    private String exam;
    private double score;
    private String category;
    private List<String> selectedBranches;
    private String scoreType;

    // Getters and Setters
    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSelectedBranches() {
        return selectedBranches;
    }

    public void setSelectedBranches(List<String> selectedBranches) {
        this.selectedBranches = selectedBranches;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }
}
