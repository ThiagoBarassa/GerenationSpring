package br.com.generation.primeiroex.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiroex")
public class MenHabController {
	
	@GetMapping
	public String primeira() {
		String text = "Habilidades e Mentalidades";
		return text;
	}
	
	@GetMapping("/primeiraMen")
	public String primeiraMentalidade() {
		String men1 = "A primeira mentalidade é a de PERSISTENCIA";
		return men1;
	}
	
	@GetMapping("/segundaMen")
	public String segundaMentalidade() {
		String men2 = "A segunda mentalidade é a MENTALIDADE DE CRESCIMENTO";
		return men2;
	}
	
	@GetMapping("/primeiraHab")
	public String primeiraHabilidade() {
		String hab1 = "A primeira habilidade é a de ATENÇÃO AOS DETALHES";
		return hab1;
	}
	
	@GetMapping("/segundaHab")
	public String segundaHabilidade() {
		String hab2 = "A segunda habilidade é a de COMUNICAÇÃO";
		return hab2;
	}
}
