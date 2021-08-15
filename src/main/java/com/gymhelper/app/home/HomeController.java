package com.gymhelper.app.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map index() {
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("/training", "all trainings for user");
        endpoints.put("/training/{id}", "training details");

        return endpoints;
    }
}
