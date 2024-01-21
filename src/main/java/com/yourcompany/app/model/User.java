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

    /*
    EFFECT: Make a post to find team members
    - select a hackathon channel
    - post messages with status (live)
     */
    public void doPost() {}

    // EFFECT: Send a message to the host to talk
    public void sendMessage() {}

    // EFFECT: Make a post resolved and close it
    public void makePostResolved() {}

    // To check the connection to its test module
    public String getName() {
        return this.name;
    }

    // later things:
    // - filters: using tags
    // - click into posts to send short (pre-filled) messages
    // - options for host or participant
}
