package com.yourcompany.app.model;

import java.util.List;

public class Posting {
    public enum Status {
        STILL_SEARCHING, // (# of open spots); default
        IN_COMMUNICATION, // if participant send a message
        FOUND // if approved
    }
    public enum Channel {
        NEW_HACKS_2024,
        NEW_HACKS_2023,
        NEW_HACKS_2022
    }
    public enum Role {
        BACK_END,
        FRONT_END,
        UX_UI_DESIGNER
    }

    private final String postingName;
    private Channel channel;
    private Status status;
    private String description;
    private List<Role> roles;
    private List<User> users_in_team;

    public Posting(String name) {
        this.postingName = name;
        this.status = Status.STILL_SEARCHING;
    }

    public void setChannel() {}

    public void setRoles() {}

    public void setStatus() {}

    public void writeDescription(String description) {
        this.description = description;
    }

    // To check the connection to its test module
    public String getName() {
        return this.postingName;
    }
}
