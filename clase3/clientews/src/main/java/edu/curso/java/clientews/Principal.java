package edu.curso.java.clientews;

import edu.curso.java.clientews.clientegenerado.HolaMundoWS;
import edu.curso.java.clientews.clientegenerado.HolaMundoWSService;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HolaMundoWSService holaMundoWSService = new HolaMundoWSService();
		
		HolaMundoWS clienteWS = holaMundoWSService.getHolaMundoWSPort();
		
		System.out.println(clienteWS.saludar());
		
	}

}
