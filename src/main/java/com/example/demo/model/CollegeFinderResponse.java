package com.example.demo.model;

import java.util.List;

public class CollegeFinderResponse {
    private List<College> colleges;

    public CollegeFinderResponse(List<College> colleges) {
        this.colleges = colleges;
    }

    public List<College> getColleges() {
        return colleges;
    }

    public void setColleges(List<College> colleges) {
        this.colleges = colleges;
    }
}
