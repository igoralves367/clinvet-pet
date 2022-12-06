package br.com.clinvet.clinvetpet.pet.application.api;

import java.time.LocalDate;

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
}
