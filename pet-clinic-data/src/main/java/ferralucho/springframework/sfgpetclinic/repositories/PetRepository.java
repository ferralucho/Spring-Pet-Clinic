package ferralucho.springframework.sfgpetclinic.repositories;

import ferralucho.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
