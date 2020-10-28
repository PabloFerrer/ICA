package com.grupoica.repasojava.modelo;

public class Usuario {
	
	private String nombre;
	private int edad;
	
	public Usuario() {
		super();
		nombre = "Sin nombre";
	}
	
	public Usuario(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		Usuario us = (Usuario) obj;
		return this.nombre == us.nombre &&
				this.edad == us.edad;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario " + nombre + " [" + edad + "]";
	}
	
	
}
