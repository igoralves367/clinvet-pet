package br.com.clinvet.clinvetpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClinvetPetApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Clinvet Pet - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClinvetPetApplication.class, args);
	}
}
