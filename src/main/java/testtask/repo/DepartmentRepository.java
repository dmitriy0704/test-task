package testtask.repo;

import org.springframework.data.repository.CrudRepository;
import testtask.entity.Department;

import java.util.List;


public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
