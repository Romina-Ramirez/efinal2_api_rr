package com.uce.edu.service;

import java.io.Serializable;

public class EstudianteTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;
	private String cedula;

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
