package com.CodingShuttle.Practice.week2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class controllerV1 {
    @GetMapping(path = "/Health-Check")
    public String HealthCheck(){
        return "Health check is Done";
    }
}
