package testtask.repo;

import org.springframework.data.repository.CrudRepository;
import testtask.entity.Department;


public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
