package br.com.clinvet.clinvetpet.pet.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.clinvet.clinvetpet.cliente.application.service.ClienteService;
import br.com.clinvet.clinvetpet.pet.application.api.PetRequest;
import br.com.clinvet.clinvetpet.pet.application.api.PetResponse;
import br.com.clinvet.clinvetpet.pet.application.repository.PetRepository;
import br.com.clinvet.clinvetpet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
	private final ClienteService clienteService;
	private final PetRepository petRepository;

	@Override
	public PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia] PetApplicationService - criaPet");
		clienteService.buscaClienteAtravesId(idCliente);
		Pet pet = petRepository.salvaPet(new Pet(idCliente, petRequest));
		log.info("[finaliza] PetApplicationService - criaPet");
		return new PetResponse(pet.getIdPet());
	}
}
