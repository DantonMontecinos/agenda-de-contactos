package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelo.Contacto;


@Repository
public interface ContactoRepositorio extends JpaRepository <Contacto,Integer > {
	
	
	
}
