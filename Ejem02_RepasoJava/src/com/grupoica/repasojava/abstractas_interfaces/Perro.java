package com.grupoica.repasojava.abstractas_interfaces;

public class Perro implements Animal {
	
	private String comida;
	
	public Perro(String comida) {
		super();
		this.comida = comida;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	@Override
	public void alimentarse() {
		System.out.println("Perro comiendo " + comida);

	}

}
