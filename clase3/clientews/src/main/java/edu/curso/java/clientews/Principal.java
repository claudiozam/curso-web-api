package edu.curso.java.clientews;

import edu.curso.java.clientews.clientegenerado.HolaMundoWS;
import edu.curso.java.clientews.clientegenerado.HolaMundoWSService;
import edu.curso.java.clientews.clientegenerado.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HolaMundoWSService holaMundoWSService = new HolaMundoWSService();		
		HolaMundoWS clienteWS = holaMundoWSService.getHolaMundoWSPort();
		System.out.println(clienteWS.saludar());
		
		Producto producto = clienteWS.recuperarProductoPorId(99L);
		System.out.println(producto.getNombre());
		System.out.println(producto.getId());
		System.out.println(producto.getPrecio());

	}

}
