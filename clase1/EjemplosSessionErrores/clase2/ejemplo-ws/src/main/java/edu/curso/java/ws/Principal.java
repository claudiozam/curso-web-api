package edu.curso.java.ws;

import javax.xml.ws.Endpoint;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando el servicio");
		Endpoint.publish("http://localhost:8080/holamundows", new HolaMundoWS());
		
	}

}
