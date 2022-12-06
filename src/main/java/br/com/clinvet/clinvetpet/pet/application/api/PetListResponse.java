package br.com.clinvet.clinvetpet.pet.application.api;

import br.com.clinvet.clinvetpet.pet.domain.Porte;
import br.com.clinvet.clinvetpet.pet.domain.SexoPet;
import br.com.clinvet.clinvetpet.pet.domain.TipoPet;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

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
