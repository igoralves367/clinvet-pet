package br.com.clinvet.clinvetpet.cliente.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.clinvet.clinvetpet.cliente.application.repository.ClienteRepository;
import br.com.clinvet.clinvetpet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringaDataJPARepository clienteSpringaDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringaDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
		log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
		return null;
	}

}
