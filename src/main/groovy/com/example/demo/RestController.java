package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/demo")
public class RestController {

    @GetMapping(path = "/dajIme")
    public String getName() {
        return "Ovaj?";
    }
}
