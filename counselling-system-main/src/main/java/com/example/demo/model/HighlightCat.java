package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "gate_highlights")
public class HighlightGate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String highlight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private GateCollege college;

    // Getters and Setters

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getHighlight() { return highlight;}
    public void setHighlight(String highlight) { this.highlight = highlight;}

    public GateCollege getCollege() { return college;}
    public void setCollege(GateCollege college) { this.college = college;}
}


