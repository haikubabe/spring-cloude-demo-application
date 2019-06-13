package com.demo.services.config.mesage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return message;
    }
}
