package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "jee_mains_highlights")
public class Highlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String highlight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private JeeMainsCollege college;

    // Getters and Setters

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getHighlight() { return highlight;}
    public void setHighlight(String highlight) { this.highlight = highlight;}

    public JeeMainsCollege getCollege() { return college;}
    public void setCollege(JeeMainsCollege college) { this.college = college;}
}

