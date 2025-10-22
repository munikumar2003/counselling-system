package com.example.demo.model;

public class Notification {
    private Long id;
    private String title;
    private String message;
    private String time;
    private String type;

    public Notification(Long id, String title, String message, String time, String type) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.time = time;
        this.type = type;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
