package com.yourcompany.app.server;

import static spark.Spark.*;

public class ApplicationServer {
    public static void init() {
        port(4321);
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");
    }
}
