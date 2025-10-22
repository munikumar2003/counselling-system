package com.example.demo.model;

import java.util.List; // 👈 Add this import
import java.util.Set;  // 👈 (Recommended) Import for using Set
import java.util.HashSet; // 👈 (Recommended) Import for initializing Set

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "counselors")
public class Counselor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // 🌟 Recommended change: Use Set instead of List
    @OneToMany(mappedBy = "counselor") // Correctly refers to the 'counselor' field in the User entity
    private Set<User> users = new HashSet<>(); // Initialize the collection

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 🌟 Update method signatures to use Set<User>
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}