package com.example.demo.model;

public class Document {
    private String id;
    private String name;
    private String description;
    private boolean required;
    private String category;
    private String status;
    private String deadline;
    private String format;
    private String size_limit;
    private String sample_link;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSize_limit() {
        return size_limit;
    }

    public void setSize_limit(String size_limit) {
        this.size_limit = size_limit;
    }

    public String getSample_link() {
        return sample_link;
    }

    public void setSample_link(String sample_link) {
        this.sample_link = sample_link;
    }
}
