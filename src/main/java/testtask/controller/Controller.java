package testtask.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testtask.entity.Department;
import testtask.repo.DepartmentRepository;

@RestController
@RequestMapping("/api")  //produces = "application/json"
public class Controller {

    private DepartmentRepository departmentRepository;

    public Controller(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @GetMapping("/dept")
    public String getDepartment() {
        Department department = departmentRepository.findById(1L).get();
        ;
        return department.getName();
    }
}
