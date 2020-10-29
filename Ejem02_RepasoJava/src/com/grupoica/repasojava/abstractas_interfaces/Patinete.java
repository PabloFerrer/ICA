package com.grupoica.repasojava.abstractas_interfaces;

public class Patinete implements Motorizable {
	
	private String bateria;
	
	
	public Patinete(String bateria) {
		super();
		this.bateria = bateria;
	}


	@Override
	public void encender() {
		System.out.println("Encendiendo patinete con " + bateria + " bateria");
	}

}
