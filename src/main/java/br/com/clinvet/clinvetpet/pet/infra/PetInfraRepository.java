package br.com.clinvet.clinvetpet.pet.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.clinvet.clinvetpet.handler.APIException;
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

	@Override
	public Pet buscaPetPeloId(UUID idPet) {
		log.info("[start] PetInfraRepository - buscaPetPeloId");
		var pet = petSpringDataJPARepository.findById(idPet)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pet não encontrado para o IdPet = " + idPet));
		log.info("[finish] PetInfraRepository - buscaPetPeloId");
		return pet;
	}

	@Override
	public void deletaPet(Pet pet) {
		log.info("[start] PetInfraRepository - deletaPet");
		petSpringDataJPARepository.delete(pet);
		log.info("[finish] PetInfraRepository - deletaPet");
		
	}
}
