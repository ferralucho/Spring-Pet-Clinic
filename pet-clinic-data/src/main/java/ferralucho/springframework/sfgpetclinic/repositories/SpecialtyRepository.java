package ferralucho.springframework.sfgpetclinic.repositories;

import ferralucho.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}

