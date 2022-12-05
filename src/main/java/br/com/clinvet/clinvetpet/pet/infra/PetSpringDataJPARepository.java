package br.com.clinvet.clinvetpet.pet.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.clinvet.clinvetpet.pet.domain.Pet;

public interface PetSpringDataJPARepository extends JpaRepository<Pet, UUID>{

}
