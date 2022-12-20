package br.com.clinvet.clinvetpet.pet.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.clinvet.clinvetpet.pet.domain.Porte;
import br.com.clinvet.clinvetpet.pet.domain.SexoPet;
import br.com.clinvet.clinvetpet.pet.domain.TipoPet;
import lombok.Value;
@Value
public class PetAlteracaoRequest {
	private String nomePet;
	private Porte porte;
	@NotNull
	private TipoPet tipo;
	private String microchip;
	@NotBlank
	private String raca;
	@NotNull
	private SexoPet sexo;
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	private Integer peso;
}
