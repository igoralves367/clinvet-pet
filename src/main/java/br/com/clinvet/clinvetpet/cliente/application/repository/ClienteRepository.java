package br.com.clinvet.clinvetpet.cliente.application.repository;

import java.util.List;

import br.com.clinvet.clinvetpet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();

}
