package edu.curso.java.webapi.ejemplorest.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.webapi.ejemplorest.bo.Producto;
import edu.curso.java.webapi.ejemplorest.dao.ProductosDAO;
import edu.curso.java.webapi.ejemplorest.rest.dto.ProductoDTO;
import edu.curso.java.webapi.ejemplorest.service.ProductosService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosRestController {

	@Autowired
	private ProductosService productosService;
	
	@GetMapping
	public ResponseEntity<List<ProductoDTO>> buscarProductos() {
		System.out.println("Ejecutando listado");
		
		
		List<ProductoDTO> productosDTO = new ArrayList<>();
		
		productosDTO.add(new ProductoDTO(1L, "Producto1", 1000.0));
		productosDTO.add(new ProductoDTO(2L, "Producto2", 1000.0));
		productosDTO.add(new ProductoDTO(3L, "Producto3", 1000.0));
		
		return new ResponseEntity<List<ProductoDTO>>(productosDTO, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductoDTO> buscarProductoPorId(@PathVariable Long id) {
		System.out.println("Ejecutando buscar " + id);
		
		Producto producto = productosService.buscarPorId(id);
		
		if(producto != null ) {
			ProductoDTO productoDTO = new ProductoDTO(id, producto.getNombre(), producto.getPrecio());
			return new ResponseEntity<ProductoDTO>(productoDTO, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public ResponseEntity<ProductoDTO> altaDeNuevoProducto(@RequestBody ProductoDTO productoDTO) {
		System.out.println("Ejecutando alta " + productoDTO.getNombre());
		Producto producto = new Producto();
		producto.setNombre(productoDTO.getNombre());
		producto.setPrecio(productoDTO.getPrecio());
		Long idGenerado = productosService.altaDeProducto(producto);
		
		productoDTO.setId(idGenerado);
		
		return new ResponseEntity<ProductoDTO>(productoDTO, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProductoDTO> actualizarProducto(@PathVariable Long id, @RequestBody ProductoDTO productoDTO) {
		System.out.println("Ejecutando actualizar " + id);
		return new ResponseEntity<ProductoDTO>(productoDTO, HttpStatus.OK);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity borrarProductoPorId(@PathVariable Long id) {
		System.out.println("Ejecutando borrado " + id);
		
		return new ResponseEntity(null, HttpStatus.NO_CONTENT);
	}
	
	
	
}
