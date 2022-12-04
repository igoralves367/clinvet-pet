package br.com.clinvet.clinvetpet.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

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

}
