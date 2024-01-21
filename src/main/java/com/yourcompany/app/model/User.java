package com.yourcompany.app.model;

import java.util.ArrayList;

public class User {
    public enum StudyLevel {
        HIGH_SCHOOL,
        COLLEGE,
        UNIVERSITY,
        GRADUATE,
        OTHERS
    }

    public enum Language {
        PYTHON,
        JAVA
    }

    private enum Framework {
        REACT,
        MAVEN,
        SPARK
    }

    public String name;
    private StudyLevel studyLevel; // degree
    private int studyYear;
    private String program;
    private ArrayList<Language> languages; // available languages
    private ArrayList<Framework> frameworks; // available framework
    private String message;
    private boolean messageStatus;

    public User(String name, StudyLevel studyLevel, int studyYear) {
        this.name = name;
        this.studyLevel = studyLevel;
        this.studyYear = studyYear;
        this.program = "";
        this.languages = new ArrayList<Language>();
        this.frameworks = new ArrayList<Framework>();
        this.message = "";
        this.messageStatus = false;
    }

    public String getName() {
        return this.name;
    }

    public Posting doPost(String postingName, Posting.Channel channel, int spots, String description) {
        Posting newPosting = new Posting(postingName, channel, spots);
        newPosting.writeDescription(description);
        return newPosting;
    }

    public void sendMessage(Posting posting, String message) {
        posting.setStatusInCommunication();
        this.message = message;
        this.messageStatus = true;
    }



    // EFFECT: Make a post resolved and close it
    public void makePostResolved(Posting posting) {
        posting.setStatusFound();
    }



    // later things if possible:
    // - filters: using tags
    // - click into posts to send short (pre-filled) messages
    // - options for host or participant
}
