package com.yourcompany.app.server;

import static spark.Spark.*;
import com.yourcompany.app.model.User;
import freemarker.template.Configuration;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.yourcompany.app.model.User.StudyLevel;

public class ApplicationServer {
    public static void init() {
        port(4321);
        staticFiles.location("/public");
        Configuration freeMarkerConfiguration = new Configuration(Configuration.VERSION_2_3_23);
        freeMarkerConfiguration.setClassForTemplateLoading(ApplicationServer.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(freeMarkerConfiguration);

        get("/event", (req, res) -> {
            return new ModelAndView(new HashMap<>(), "eventPage.ftl");
        }, freeMarkerEngine);
        exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
            response.status(500);
            response.body("Server Error: " + exception.getMessage());
        });

        get("/live-room", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "liveRoom.ftl");
        }, freeMarkerEngine);

        post("/register", (req, res) -> {
            String name = req.queryParams("name");
            String studyLevelParam = req.queryParams("studyLevel").toUpperCase();
            String studyYearParam = req.queryParams("studyYear");
            if(name.isEmpty() || studyYearParam.isEmpty()) {
                res.status(400);
                return "Name and Study Year are required.";
            }
            StudyLevel studyLevel;
            try {
                studyLevel = StudyLevel.valueOf(studyLevelParam);
            } catch (IllegalArgumentException e) {
                res.status(400);
                return "Invalid Study Level provided.";
            }
            int studyYear;
            try {
                studyYear = Integer.parseInt(studyYearParam);
            } catch (NumberFormatException e) {
                res.status(400);
                return "Study Year must be an integer.";
            }
            User user = new User(name, studyLevel, studyYear);
            res.status(201);
            return "User " + user.getName() + " starts.";
        });
    }
}
