package br.com.clinvet.clinvetpet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.clinvet.clinvetpet.cliente.application.api.ClienteDetalhadoResponse;
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
		List<Cliente> cliente = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClintes");
		return ClienteListResponse.converte(cliente);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return null;
	}
}
