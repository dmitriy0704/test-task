package testtask.repo;

import org.springframework.data.repository.CrudRepository;
import testtask.entity.Department;


public interface EmployeeRepository extends CrudRepository<Department, Long> {
}
