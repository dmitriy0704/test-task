package testtask.repo;

import org.springframework.data.repository.CrudRepository;
import testtask.entity.Profession;


public interface ProfessionRepository extends CrudRepository<Profession, Long> {
}
