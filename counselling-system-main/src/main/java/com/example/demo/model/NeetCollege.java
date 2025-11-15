package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Table(name = "neet_colleges")
public class NeetCollege {

    @Id
    private String id;

    private String name;
    private String location;
    private String type;
    private double rating;
    private double fees;
    private int nirfRanking;
    private int established;
    private int seats;
    private int popularityScore;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<BranchNeet> branches;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CutoffNeet> cutoffs;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<HighlightNeet> highlights;

    // Getters and Setters

    public String getId() { return id;}
    public void setId(String id) { this.id = id;}

    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public String getLocation() { return location;}
    public void setLocation(String location) { this.location = location;}

    public String getType() { return type;}
    public void setType(String type) { this.type = type;}

    public double getRating() { return rating;}
    public void setRating(double rating) { this.rating = rating;}

    public double getFees() { return fees;}
    public void setFees(double fees) { this.fees = fees;}

    public int getNirfRanking() { return nirfRanking;}
    public void setNirfRanking(int nirfRanking) { this.nirfRanking = nirfRanking;}

    public int getEstablished() { return established;}
    public void setEstablished(int established) { this.established = established;}

    public int getSeats() { return seats;}
    public void setSeats(int seats) { this.seats = seats;}

    public int getPopularityScore() { return popularityScore;}
    public void setPopularityScore(int popularityScore) { this.popularityScore = popularityScore;}

    public List<BranchNeet> getBranches() { return branches;}
    public void setBranches(List<BranchNeet> branches) { this.branches = branches;}

    public List<CutoffNeet> getCutoffs() { return cutoffs;}
    public void setCutoffs(List<CutoffNeet> cutoffs) { this.cutoffs = cutoffs;}

    public List<HighlightNeet> getHighlights() { return highlights;}
    public void setHighlights(List<HighlightNeet> highlights) { this.highlights = highlights;}
}

