package com.demo.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRestController {

    @Value("${message:Hello Default}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message;
    }
}
