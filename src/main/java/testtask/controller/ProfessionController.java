package testtask.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testtask.entity.Department;
import testtask.entity.Profession;
import testtask.repo.DepartmentRepository;
import testtask.repo.ProfessionRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/prof")
@CrossOrigin
public class ProfessionController {

    private final ProfessionRepository professionRepository;

    public ProfessionController(ProfessionRepository professionRepository) {
        this.professionRepository = professionRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profession> getProfessionById(@PathVariable("id") Long id) {
        Optional<Profession> optional = professionRepository.findById(id);
        return optional
                .map(ResponseEntity::ok)
                .orElseGet(() ->
                        new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @GetMapping(params = "list")
    public Iterable<Profession> getProfessions() {
        return professionRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Profession createProfession(@RequestBody Profession profession) {
        return professionRepository.save(profession);
    }

}
