package com.example.demo.model;

import java.util.List;

public class Review {
    private String id;
    private String college;
    private String branch;
    private String student_name;
    private String batch;
    private double rating;
    private double placement_rating;
    private double faculty_rating;
    private double campus_rating;
    private String review_text;
    private List<String> pros;
    private List<String> cons;
    private boolean verified;
    private int helpful_count;
    private String date;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPlacement_rating() {
        return placement_rating;
    }

    public void setPlacement_rating(double placement_rating) {
        this.placement_rating = placement_rating;
    }

    public double getFaculty_rating() {
        return faculty_rating;
    }

    public void setFaculty_rating(double faculty_rating) {
        this.faculty_rating = faculty_rating;
    }

    public double getCampus_rating() {
        return campus_rating;
    }

    public void setCampus_rating(double campus_rating) {
        this.campus_rating = campus_rating;
    }

    public String getReview_text() {
        return review_text;
    }

    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }

    public List<String> getPros() {
        return pros;
    }

    public void setPros(List<String> pros) {
        this.pros = pros;
    }

    public List<String> getCons() {
        return cons;
    }

    public void setCons(List<String> cons) {
        this.cons = cons;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getHelpful_count() {
        return helpful_count;
    }

    public void setHelpful_count(int helpful_count) {
        this.helpful_count = helpful_count;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
