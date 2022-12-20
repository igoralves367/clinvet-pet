package br.com.clinvet.clinvetpet.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.clinvet.clinvetpet.cliente.domain.Cliente;
import br.com.clinvet.clinvetpet.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.sexo = cliente.getSexo();
		this.dataNascimento = cliente.getDataNascimento();
		this.cpf = cliente.getCpf();
	}	
}
