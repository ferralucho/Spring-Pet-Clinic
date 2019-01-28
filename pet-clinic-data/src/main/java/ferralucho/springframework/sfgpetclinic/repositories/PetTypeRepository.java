package ferralucho.springframework.sfgpetclinic.repositories;

import ferralucho.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
