package com.yourcompany.app.model;


import java.util.List;

enum Status {
    STILL_SEARCHING, // (# of open spots); default
    IN_COMMUNICATION, // if participant send a message
    FOUND // if approved
}

public class Posting {
    private String team_name;
    private String channel;
    private String status;
    private List<User> users_in_team;
    private List<String> roles_looking_for;
    private String description;

    // functions: contains users
    public Posting(String team_name) {
        this.team_name = team_name;
    }

    public String getName() {
        return this.team_name;
    }
}
