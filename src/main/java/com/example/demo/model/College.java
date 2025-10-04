package com.example.demo.model;

import java.util.List;
import java.util.Map;

public class College {
    private String id;
    private String name;
    private String location;
    private String type;
    private int nirf_rank;
    private int fees;
    private List<String> branches;
    private Map<String, Map<String, Double>> cutoffs;
    private double rating;
    private List<String> highlights;

    // Getters and Setters

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

    public int getNirf_rank() {
        return nirf_rank;
    }

    public void setNirf_rank(int nirf_rank) {
        this.nirf_rank = nirf_rank;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public Map<String, Map<String, Double>> getCutoffs() {
        return cutoffs;
    }

    public void setCutoffs(Map<String, Map<String, Double>> cutoffs) {
        this.cutoffs = cutoffs;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }
}
