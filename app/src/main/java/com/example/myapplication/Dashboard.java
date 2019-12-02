package com.example.myapplication;

public class Dashboard {

    String Title, Content;
    int eventPhoto;

    public Dashboard() {
    }

    public Dashboard(String title, String content, int eventPhoto) {
        Title = title;
        Content = content;
        this.eventPhoto = eventPhoto;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getEventPhoto() {
        return eventPhoto;
    }

    public void setEventPhoto(int eventPhoto) {
        this.eventPhoto = eventPhoto;
    }
}
