package edu.curso.java.webapi.ejemplorest.bo;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private Double precio;
	private Double costo;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, Double precio) {
		super();
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
	
	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	
}
