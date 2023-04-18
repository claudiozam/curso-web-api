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
	
}
