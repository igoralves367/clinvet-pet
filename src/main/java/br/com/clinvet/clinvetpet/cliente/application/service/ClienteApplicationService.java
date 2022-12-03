package br.com.clinvet.clinvetpet.cliente.application.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.clinvet.clinvetpet.cliente.application.api.ClienteListResponse;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteRequest;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteResponse;
import br.com.clinvet.clinvetpet.cliente.application.repository.ClienteRepository;
import br.com.clinvet.clinvetpet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClintes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClintes");
		log.info("[finaliza] ClienteApplicationService - buscaTodosClintes");
		return null;
	}

}
