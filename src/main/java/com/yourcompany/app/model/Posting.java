package com.yourcompany.app.model;

import java.util.ArrayList;

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

    private boolean active;
    private final String postingName;
    private Channel channel;
    private int spot;
    private Status status;
    private String contents;
    private ArrayList<Role> rolesNeeded;
    private ArrayList<User> usersInTeam;

    public Posting(String name, Channel channel, int spot) {
        this.active = true;
        this.postingName = name;
        this.channel = channel;
        this.spot = spot;
        this.status = Status.STILL_SEARCHING;
        this.contents = "";
        this.rolesNeeded = new ArrayList<Role>();
        this.usersInTeam = new ArrayList<User>();
    }

    public boolean isActive() {
        return this.active;
    }
    public String getName() {
        return this.postingName;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public int getSpot() {
        return this.spot;
    }

    public void decreaseRemainingSpot() {
        this.spot--;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatusSearching() {
        this.status = Status.STILL_SEARCHING;
    }

    public void setStatusInCommunication() {
        this.status = Status.IN_COMMUNICATION;
    }

    public void setStatusFound() {
        this.status = Status.FOUND;
    }

    public void setPostingClosed() {
        this.setStatusFound();
        this.active = false;
        // and some function to disappear posting
    }

    public String getContents() {
        return this.contents;
    }

    public void writeDescription(String description) {
        this.contents = description;
    }

    public void clearDescription() {
        this.contents = "";
    }

    public ArrayList<Role> getRolesNeeded() {
        return this.rolesNeeded;
    }

    public ArrayList<User> getUsersInTeam() {
        return this.usersInTeam;
    }

    public void addRole(Role role) {
        this.rolesNeeded.add(role);
        // should make it up to 4?
    }

    public void addUser(User user) {
        this.usersInTeam.add(user);
        decreaseRemainingSpot();
        if (this.spot == 0) {
            setPostingClosed();
        }
    }
}
