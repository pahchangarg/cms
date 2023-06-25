package com.pahchan.springcms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {

    @GetMapping(value = "/")
    public String home() {
        return "Apllication is working" + new Date();
    }
}
