package br.com.clinvet.clinvetpet.cliente.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.clinvet.clinvetpet.cliente.application.api.ClienteRequest;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
