package com.yourcompany.app.model;

import java.util.ArrayList;

public class User {

    public enum StudyLevel { HIGH_SCHOOL, COLLEGE, UNIVERSITY, GRADUATE, OTHERS }
    private enum Language { PYTHON, JAVA }
    private enum Framework { REACT, MAVEN, SPARK }
    private String name;
    private StudyLevel studyLevel; // degree
    private int studyYear;
//    private String program;
//    private ArrayList<Language> languages; // available languages
//    private ArrayList<Framework> frameworks; // available framework
    private String userMessage;
    private boolean sentMessage = false;

    public User(String name, StudyLevel studyLevel, int studyYear) {
        this.name = name;
        this.studyLevel = studyLevel;
        this.studyYear = studyYear;
//        this.program = "";
//        this.languages = new ArrayList<Language>();
//        this.frameworks = new ArrayList<Framework>();
        this.userMessage = "";
    }

    public String getName() {
        return this.name;
    }

    public Object getStudyLevel() {
        return this.studyLevel;
    }

    public Object getStudyYear() {
        return this.studyYear;
    }

    public void sendMessage(Posting posting, String message) {
        Message newMessage = new Message(message);
        this.userMessage = newMessage.getContent();
        this.sentMessage = true;
    }
}
