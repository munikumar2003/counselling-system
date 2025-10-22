package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendData {
    private String year;
    private int closing_rank;
    private Boolean predicted;

    // Getters and Setters
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getClosing_rank() {
        return closing_rank;
    }

    public void setClosing_rank(int closing_rank) {
        this.closing_rank = closing_rank;
    }

    public Boolean getPredicted() {
        return predicted;
    }

    public void setPredicted(Boolean predicted) {
        this.predicted = predicted;
    }
}
