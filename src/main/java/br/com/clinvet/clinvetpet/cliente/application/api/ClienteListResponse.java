package br.com.clinvet.clinvetpet.cliente.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.clinvet.clinvetpet.cliente.domain.Cliente;
import br.com.clinvet.clinvetpet.cliente.domain.Sexo;
import lombok.Value;
@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;
	
	
	
	public static List<ClienteListResponse> converte(List<Cliente> cliente) {
		// TODO Auto-generated method stub
		return null;
	} 
}
