package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "jee_advanced_branches")
public class BranchAdvanced {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private JeeAdvancedCollege college;

    // Getters and Setters

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getBranchName() { return branchName;}
    public void setBranchName(String branchName) { this.branchName = branchName;}

    public JeeAdvancedCollege getCollege() { return college;}
    public void setCollege(JeeAdvancedCollege college) { this.college = college;}
}

