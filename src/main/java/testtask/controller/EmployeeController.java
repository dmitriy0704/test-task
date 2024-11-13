package testtask.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testtask.entity.Department;
import testtask.repo.DepartmentRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/empl")
@CrossOrigin
public class EmployeeController {

    private DepartmentRepository departmentRepository;

    public EmployeeController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long id) {
        Optional<Department> optionalDepartment = departmentRepository.findById(id);
        return optionalDepartment
                .map(ResponseEntity::ok)
                .orElseGet(() ->
                        new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @GetMapping(params = "list")
    public Iterable<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

}
