package testtask.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testtask.entity.Department;
import testtask.entity.Employee;
import testtask.repo.DepartmentRepository;
import testtask.repo.EmployeeRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/empl")
@CrossOrigin
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        return optional
                .map(ResponseEntity::ok)
                .orElseGet(() ->
                        new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @GetMapping(params = "list")
    public Iterable<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee.toString());
        return employeeRepository.save(employee);
    }

}
