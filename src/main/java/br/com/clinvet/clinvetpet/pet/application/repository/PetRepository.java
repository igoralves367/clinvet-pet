package br.com.clinvet.clinvetpet.pet.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.clinvet.clinvetpet.pet.domain.Pet;

public interface PetRepository {
	Pet salvaPet(Pet pet);
	List<Pet> buscaPetsDoClienteComId(UUID idCliente);
	Pet buscaPetPeloId(UUID idPet);

}
