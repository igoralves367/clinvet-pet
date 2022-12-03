package br.com.clinvet.clinvetpet.cliente.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.clinvet.clinvetpet.cliente.domain.Cliente;

public interface ClienteSpringaDataJPARepository extends JpaRepository<Cliente, UUID> {

}
