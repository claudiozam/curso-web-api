package edu.curso.java.webapi.ejemplorest.rest.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductoDTO {

	private Long id;
	
	@NotBlank
	private String nombre;
	
	@NotNull
	@DecimalMin("1")
	private Double precio;
	
	public ProductoDTO() { }
	
	public ProductoDTO(Long id, String nombre, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
