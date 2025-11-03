package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "jee_advanced_cutoffs")
public class CutoffAdvanced {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branchName;

    private Double general;
    private Double obc;
    private Double sc;
    private Double st;
    private Double ews;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private JeeAdvancedCollege college;

    // Getters and Setters

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getBranchName() { return branchName;}
    public void setBranchName(String branchName) { this.branchName = branchName;}

    public Double getGeneral() { return general;}
    public void setGeneral(Double general) { this.general = general;}

    public Double getObc() { return obc;}
    public void setObc(Double obc) { this.obc = obc;}

    public Double getSc() { return sc;}
    public void setSc(Double sc) { this.sc = sc;}

    public Double getSt() { return st;}
    public void setSt(Double st) { this.st = st;}

    public Double getEws() { return ews;}
    public void setEws(Double ews) { this.ews = ews;}


    public JeeAdvancedCollege getCollege() { return college;}
    public void setCollege(JeeAdvancedCollege college) { this.college = college;}
}


