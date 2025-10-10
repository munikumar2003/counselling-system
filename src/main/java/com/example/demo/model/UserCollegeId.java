package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserCollegeId implements Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "college_id")
    private String collegeId;

    // Constructors
    public UserCollegeId() {
    }

    public UserCollegeId(Long userId, String collegeId) {
        this.userId = userId;
        this.collegeId = collegeId;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollegeId that = (UserCollegeId) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(collegeId, that.collegeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, collegeId);
    }
}
