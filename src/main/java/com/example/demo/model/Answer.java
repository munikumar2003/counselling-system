package com.example.demo.model;

public class Answer {
    private String id;
    private String question_id;
    private String content;
    private String author;
    private int upvotes;
    private String date;
    private boolean best_answer;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isBest_answer() {
        return best_answer;
    }

    public void setBest_answer(boolean best_answer) {
        this.best_answer = best_answer;
    }
}
