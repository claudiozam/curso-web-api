package edu.curso.java.webapi.ejemplorest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.curso.java.webapi.ejemplorest.bo.Producto;

@Repository
public interface ProductosDAO extends CrudRepository<Producto, Long> {

}
