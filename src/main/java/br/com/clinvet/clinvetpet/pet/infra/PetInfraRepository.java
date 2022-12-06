package br.com.clinvet.clinvetpet.pet.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.clinvet.clinvetpet.pet.application.repository.PetRepository;
import br.com.clinvet.clinvetpet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {

	private final PetSpringDataJPARepository petSpringDataJPARepository;

	@Override
	public Pet salvaPet(Pet pet) {
		log.info("[inicia] PetInfraRepository - salvaPet");
		petSpringDataJPARepository.save(pet);
		log.info("[finaliza] PetInfraRepository - salvaPet");
		return pet;
	}

	@Override
	public List<Pet> buscaPetsDoClienteComId(UUID idCliente) {
		log.info("[inicia] PetInfraRepository - buscaPetsDoClienteComId");
		var pets = petSpringDataJPARepository.findByIdClienteTutor(idCliente);
		log.info("[finaliza] PetInfraRepository - buscaPetsDoClienteComId");
		return pets;
	}

}
