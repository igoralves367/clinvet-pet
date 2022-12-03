package br.com.clinvet.clinvetpet.cliente.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.clinvet.clinvetpet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");
		return clienteCriado;
	}

}
