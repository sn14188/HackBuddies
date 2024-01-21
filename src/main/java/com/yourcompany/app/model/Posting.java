package com.yourcompany.app.model;

public enum Status {
    STILL_SEARCHING, // (# of open spots); default
    IN_COMMUNICATION, // if participant send a message
    FOUND // if approved
}

public class Posting {
    private String team_name;
    private String channel;
    private String status;
    private List<User> users_in_team;
    private roles_looking_for;
    private String description;

    // functions: contains users
}
