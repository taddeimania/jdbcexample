package com.example.demo.models;

/**
 * Created by Joel Taddei on 7/30/2017.
 */
public class Topic {
    private long id;
    private String description, title;

    public Topic(long id, String description, String title) {
        this.id = id;
        this.description = description;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
