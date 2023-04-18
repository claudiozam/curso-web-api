package edu.curso.java.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HolaMundoWS {

	public HolaMundoWS() {
		System.out.println("Creando una instancia de HolaMundoWS.....");
	}
	
	@WebMethod
	public String saludar() {
		System.out.println("Ejecutando saludar.......");
		return "Hola a todos!!!!";
	}
	
	@WebMethod
	public Producto recuperarProductoPorId(Long id) {
		System.out.println("Recuperando el producto desde la base de datos.....");
		System.out.println("Id buscar: " + id);
		return new Producto(id, "Ejemplo Porducto1", 5000.0);
	}
	
}
