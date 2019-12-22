package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import test.hevenko.TestRepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/demo")
public class RestController {

    @Autowired
    private GlobalProperties globalProperties;

    @Autowired
    private TestRepository testRepository;


    @GetMapping(path = "dajSve")
    public ResponseEntity dajSve() {
        return ResponseEntity.ok(testRepository.findAll());
    }

    @GetMapping(path = "/dajIme")
    public String getName() {
        return globalProperties.getUrl();
    }
}
