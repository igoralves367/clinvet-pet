package br.com.clinvet.clinvetpet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.clinvet.clinvetpet.cliente.application.api.ClienteAlteracaoRequest;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteListResponse;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteRequest;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClintes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void pathAlteraCliente(UUID idCliente, @Valid ClienteAlteracaoRequest clienteAlteracaoRequest);

}
