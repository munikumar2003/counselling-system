package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "jee_advanced_highlights")
public class HighlightAdvanced {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String highlight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private JeeAdvancedCollege college;

    // Getters and Setters

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getHighlight() { return highlight;}
    public void setHighlight(String highlight) { this.highlight = highlight;}

    public JeeAdvancedCollege getCollege() { return college;}
    public void setCollege(JeeAdvancedCollege college) { this.college = college;}
}

