package com.benson.badmintonbookingsystem.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${DATABASE_URL}")
    private String databaseUrl;

    @GetMapping("/env")
    public String getEnv() {
        return "DATABASE_URL: " + databaseUrl;
    }
    @GetMapping("/")
    public String getIndex() {
        return "Hello World!";
    }

}
