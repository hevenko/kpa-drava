package hevenko.kpaDrava;

import hevenko.example.demo.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.lang.Integer.parseInt;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/kpaDrava")
public class KpaDravaController {

    @Autowired
    private GlobalProperties globalProperties;

    @Autowired
    private CategoryRepository categoryRepository;

/*
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
*/
    @DeleteMapping(path = "/categoryDELETE")
    public void deleteCategory(@RequestParam(required = false, value="id") Integer id
            , @RequestParam(required = false, value="name") String name
            , @RequestParam(required = false, value="description") String description
    ) {
        categoryRepository.delete(new Category(id, name, description));
    }

    @PutMapping(path = "/categoryCHANGE")
    public ResponseEntity changeCategory(@RequestParam(required = false, value="id") Integer id
            , @RequestParam(value="name") String name
            , @RequestParam(value="description") String description
    ) {
        return ResponseEntity.ok(categoryRepository.save(new Category(id, name, description)));
    }

    @GetMapping(path = "/categoryALL")
    public ResponseEntity allCategory() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }
}
