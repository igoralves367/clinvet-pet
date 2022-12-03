package br.com.clinvet.clinvetpet.cliente.application.service;

import java.util.List;
import javax.validation.Valid;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteListResponse;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteRequest;
import br.com.clinvet.clinvetpet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClintes();

}
