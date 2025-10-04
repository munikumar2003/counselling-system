package com.example.demo.model;

import java.util.List;

public class DashboardData {
    private User user;
    private List<Notification> notifications;

    public DashboardData(User user, List<Notification> notifications) {
        this.user = user;
        this.notifications = notifications;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
