package edu.curso.java.webapi.ejemplorest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.curso.java.webapi.ejemplorest.bo.Producto;
import edu.curso.java.webapi.ejemplorest.dao.ProductosDAO;
import java.util.*;

@Service
@Transactional
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosDAO productosDAO;
	
	@Override
	public Long altaDeProducto(Producto producto) {
		productosDAO.save(producto);
		return producto.getId();
	}
	
	@Override
	public void borrarProductoPorId(Long id) {
		productosDAO.deleteById(id);
	}
	
	@Override
	public void actualizarProducto(Producto producto) {
		productosDAO.save(producto);
	}
	
	@Override
	public Producto buscarPorId(Long id) {
		Optional<Producto> productoOptional = productosDAO.findById(id);
		
		if(productoOptional.isPresent()) {
			return productoOptional.get();
		}
		return null;
	}
	
	@Override
	public List<Producto> buscarProducto() {
		List<Producto> productos = new ArrayList<>();
		for(Producto p : productosDAO.findAll()) {
			productos.add(p);
		}
		return productos;
	}
	
}
