package hevenko.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/demo")
public class RestController {

    @Autowired
    private GlobalProperties globalProperties;

    @Autowired
    private TestRepository testRepository;


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "dajSve")
    public ResponseEntity dajSve() {
        List<TestRow> list = testRepository.findAll();
        return ResponseEntity.ok(list);
    }
    @PostMapping(value = "dodaj")
    public ResponseEntity dodaj(@RequestParam(value="id") long id, @RequestParam(value="naziv") String naziv) {
        return ResponseEntity.ok(testRepository.save(new TestRow(id, naziv)));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "dodajNaziv")
    public ResponseEntity dodajNaziv(@RequestBody TestRow testRow) {
        return ResponseEntity.ok(testRepository.save(testRow));
    }
    @GetMapping(path = "/dajDBUrl")
    public String getName() {
        return globalProperties.getUrl();
    }
}
