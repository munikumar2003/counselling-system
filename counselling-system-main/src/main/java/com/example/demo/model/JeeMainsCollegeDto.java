package com.example.demo.model;


import java.util.List;
import java.util.Map;

public class JeeMainsCollegeDto {
    private String id;
    private String name;
    private String location;
    private String type;
    private double rating;
    private double fees;
    private int nirfRanking;
    private int established;
    private int seats;
    private int popularityScore;

    private List<String> branches;
    private Map<String, CutoffDetails> cutoffs;
    private List<String> highlights;

    // Getters and setters for all fields
//    public String getId() { return id; }
//    public void setId(String id) { this.id = id; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getNirfRanking() {
        return nirfRanking;
    }

    public void setNirfRanking(int nirfRanking) {
        this.nirfRanking = nirfRanking;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPopularityScore() {
        return popularityScore;
    }

    public void setPopularityScore(int popularityScore) {
        this.popularityScore = popularityScore;
    }


    // ... other getters/setters

    public List<String> getBranches() { return branches; }
    public void setBranches(List<String> branches) { this.branches = branches; }

    public Map<String, CutoffDetails> getCutoffs() { return cutoffs; }
    public void setCutoffs(Map<String, CutoffDetails> cutoffs) { this.cutoffs = cutoffs; }

    public List<String> getHighlights() { return highlights; }
    public void setHighlights(List<String> highlights) { this.highlights = highlights; }


}
