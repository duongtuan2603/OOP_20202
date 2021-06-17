package com.example.oop_20202.data;

public class Notification {
    String date;
    String content;

    public Notification(String date, String content) {
        this.date = date;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
}
