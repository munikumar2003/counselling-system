package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@Entity
@Table(name = "reviews")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branch;
    private String student_name;
    private String batch;
    private double rating;
    private double placement_rating;
    private double faculty_rating;
    private double campus_rating;
    private String review_text;
    private boolean verified;
    private int helpful_count;
    private String date;

    @ElementCollection
    private List<String> pros;

    @ElementCollection
    private List<String> cons;

    @JsonProperty("college")
    private String collegeId;

    @Transient
    private College college;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    @JsonIgnore
    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
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
} 