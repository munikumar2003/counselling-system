package com.example.demo.model;

public class WaitTimeData {
    private String college;
    private String branch;
    private String category;
    private int userRank;
    private int openingRank;
    private int closingRank;
    private int expectedRound;
    private int probability;
    private String waitTime;
    private String riskLevel;

    // Getters and Setters
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUserRank() {
        return userRank;
    }

    public void setUserRank(int userRank) {
        this.userRank = userRank;
    }

    public int getOpeningRank() {
        return openingRank;
    }

    public void setOpeningRank(int openingRank) {
        this.openingRank = openingRank;
    }

    public int getClosingRank() {
        return closingRank;
    }

    public void setClosingRank(int closingRank) {
        this.closingRank = closingRank;
    }

    public int getExpectedRound() {
        return expectedRound;
    }

    public void setExpectedRound(int expectedRound) {
        this.expectedRound = expectedRound;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
