package edu.curso.java.webapi.ejemplorest.service;

import java.util.List;

import edu.curso.java.webapi.ejemplorest.bo.Producto;

public interface ProductosService {

	Long altaDeProducto(Producto producto);

	void borrarProductoPorId(Long id);

	void actualizarProducto(Producto producto);

	Producto buscarPorId(Long id);

	List<Producto> buscarProducto();

}