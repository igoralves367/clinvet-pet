package br.com.clinvet.clinvetpet.pet.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.clinvet.clinvetpet.pet.domain.Pet;
import br.com.clinvet.clinvetpet.pet.domain.Porte;
import br.com.clinvet.clinvetpet.pet.domain.SexoPet;
import br.com.clinvet.clinvetpet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetListResponse {

    private String nomePet;
    private Porte porte;
    private TipoPet tipo;
    private String raca;
    private SexoPet sexo;
    private String pelagemCor;
    private LocalDate dataNascimento;
    private Integer peso;
    
    
	public static List<PetListResponse> converte(List<Pet> petsDoCliente) {
		return petsDoCliente.stream()
				.map(PetListResponse::new)
				.collect(Collectors.toList());
	}

	public PetListResponse(Pet pet) {
		this.nomePet = pet.getNomePet();
		this.porte = pet.getPorte();
		this.tipo = pet.getTipo();
		this.raca = pet.getRaca();
		this.sexo = pet.getSexo();
		this.pelagemCor = pet.getPelagemCor();
		this.dataNascimento = pet.getDataNascimento();
		this.peso = pet.getPeso();
	}
}
