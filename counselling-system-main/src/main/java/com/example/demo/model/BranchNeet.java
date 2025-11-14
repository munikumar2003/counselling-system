package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "neet_branches")
public class BranchNeet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private NeetCollege college;

    // Getters and Setters

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getBranchName() { return branchName;}
    public void setBranchName(String branchName) { this.branchName = branchName;}

    public NeetCollege getCollege() { return college;}
    public void setCollege(NeetCollege college) { this.college = college;}
}


