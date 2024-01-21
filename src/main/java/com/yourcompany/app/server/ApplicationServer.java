package com.yourcompany.app.server;

import static spark.Spark.*;

public class ApplicationServer {
    public static void init() {
        port(4321);
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");

        post("/register", (req, res) -> {
            String name = req.queryParams("name");
            String studyLevel = req.queryParams("studyLevel");
            int studyYear = Integer.parseInt(req.queryParams("studyYear"));

            System.out.println("Received registration for: " + name);
            System.out.println("Study Level: " + studyLevel);
            System.out.println("Study Year: " + studyYear);

            return "User Registered";
        });
    }
}
