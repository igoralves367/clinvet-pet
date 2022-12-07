package br.com.clinvet.clinvetpet.pet.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.clinvet.clinvetpet.pet.application.api.PetClienteDetalhadoResponse;
import br.com.clinvet.clinvetpet.pet.application.api.PetListResponse;
import br.com.clinvet.clinvetpet.pet.application.api.PetRequest;
import br.com.clinvet.clinvetpet.pet.application.api.PetResponse;

public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetListResponse> buscaPetsDoClienteComId(UUID idCliente);
	PetClienteDetalhadoResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);

}
