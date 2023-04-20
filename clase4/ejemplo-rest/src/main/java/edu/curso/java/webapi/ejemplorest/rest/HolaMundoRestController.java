package edu.curso.java.webapi.ejemplorest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoRestController {

	
	@GetMapping("/saludar")
	public String saludar() {
		return "Hola!!!";
	}
	
}
