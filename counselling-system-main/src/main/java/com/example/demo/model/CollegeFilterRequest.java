package com.example.demo.model;

import java.util.List;

public class CollegeFilterRequest {
    private double score;
    private String category;
    private List<String> selectedBranches;
    private boolean homeState;
    private int userId;

    // ---------- Getters and Setters ----------


    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public List<String> getSelectedBranches() { return selectedBranches; }
    public void setSelectedBranches(List<String> selectedBranches) { this.selectedBranches = selectedBranches; }

    public boolean isHomeState() { return homeState; }
    public void setHomeState(boolean homeState) { this.homeState = homeState; }
}

