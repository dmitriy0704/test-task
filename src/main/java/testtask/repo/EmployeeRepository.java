package testtask.repo;

import org.springframework.data.repository.CrudRepository;
import testtask.entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
