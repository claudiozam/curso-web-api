package edu.curso.java.webapi.ejemplorest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.webapi.ejemplorest.rest.dto.ProductoDTO;

@RestController
public class HolaMundoRestController {

	
	@GetMapping("/saludar")
	public String saludar() {
		return "Hola!!!";
	}

	
	@GetMapping("/saludar2/{nombre}")
	public String saludar2(@PathVariable String nombre) {
		return "Hola!!! " + nombre;
	}

	@GetMapping("/saludar3/{nombre}/{edad}")
	public String saludar3(@PathVariable String nombre, @PathVariable Integer edad) {
		return "Hola!!! " + nombre + " y mi edad es " +  edad;
	}

	@GetMapping("/saludar4")
	public String saludar4(@RequestParam(required = false, defaultValue = "Sin nombre") String nombre, @RequestParam(required = false) Integer edad) {
		
		System.out.println("El valor de nombre es: " + nombre);
		System.out.println("El valor de edad es: " + edad);
		
		return "Hola!!! " + nombre + " y mi edad es " +  edad;
	}
	
	/*
	@GetMapping("/productos/{id}")
	public ProductoDTO buscarProductoPorId(@PathVariable Long id, 
			@RequestParam(required = false, defaultValue = "false") Boolean mostrarPrecio) {
		ProductoDTO productoDTO = new ProductoDTO();
		productoDTO.setId(id);
		productoDTO.setNombre("Ejemplo producto");
		if(mostrarPrecio == true) {
			productoDTO.setPrecio(5000.50);
		}
		return productoDTO;
	}*/
	
}
