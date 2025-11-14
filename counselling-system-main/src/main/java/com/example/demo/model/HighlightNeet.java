package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "neet_highlights")
public class HighlightNeet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String highlight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private NeetCollege college;

    // Getters and Setters

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getHighlight() { return highlight;}
    public void setHighlight(String highlight) { this.highlight = highlight;}

    public NeetCollege getCollege() { return college;}
    public void setCollege(NeetCollege college) { this.college = college;}
}


