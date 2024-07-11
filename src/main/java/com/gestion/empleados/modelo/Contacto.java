package com.gestion.empleados.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Nombre;
	private String email;
	private String celular;
	private LocalDate fechaNacimiento;
	private LocalDateTime fechaRegistro;
	
	public Contacto() {
		super();
	}
	
	public Contacto(Integer id, String nombre, String email, String celular, LocalDate fechaNacimiento,
			LocalDateTime fechaRegistro) {
		super();
		this.id = id;
		Nombre = nombre;
		this.email = email;
		this.celular = celular;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = fechaRegistro;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	

}
