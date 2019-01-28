package ferralucho.springframework.sfgpetclinic.repositories;

import ferralucho.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
