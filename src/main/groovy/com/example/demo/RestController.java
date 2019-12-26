package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/demo")
public class RestController {

    @Autowired
    private GlobalProperties globalProperties;

    @Autowired
    private TestRepository testRepository;


    @GetMapping(path = "dajSve")
    public ResponseEntity dajSve() {
        List<TestRow> list = testRepository.findAll();
        return ResponseEntity.ok(list);
    }
    @PostMapping(value = "dodaj")
    public ResponseEntity dodaj(@RequestParam(value="id") long id, @RequestParam(value="naziv") String naziv) {
        return ResponseEntity.ok(testRepository.save(new TestRow(id, naziv)));
    }
    @PostMapping(value = "dodajNaziv")
    public ResponseEntity dodajNaziv(@RequestParam(value="naziv") String naziv) {
        return ResponseEntity.ok(testRepository.save(new TestRow(naziv)));
    }
    @GetMapping(path = "/dajDBUrl")
    public String getName() {
        return globalProperties.getUrl();
    }
}
