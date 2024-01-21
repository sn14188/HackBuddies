package com.yourcompany.app.model;

import java.util.List;

public class User {
    private String name;
    private String level_of_study; // degree
    private int year_of_study;
    private String program;
    private List<String> languages; // available langs
    private List<String> framework; // available framework
    private String description;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // functions:
    // - select a hackathon channel
    // - post messages with status (live)
    // - function for users to send a post

    // later things:
    // - filters: using tags
    // - click into posts to send short (pre-filled) messages
    // - options for host or participant
}
