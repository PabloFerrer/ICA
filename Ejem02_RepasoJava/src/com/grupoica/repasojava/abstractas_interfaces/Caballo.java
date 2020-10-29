package com.grupoica.repasojava.abstractas_interfaces;

public class Caballo extends Vehiculo {

	private int dientes;
	
	public Caballo(String marca, float peso, int dientes) {
		super(marca, peso);
		this.dientes = dientes;
		// TODO Auto-generated constructor stub
	}
	
	public int getDientes() {
		return dientes;
	}

	public void setDientes(int dientes) {
		this.dientes = dientes;
	}

	@Override
	public void aceleracion() {
		System.out.println("Acelerando caballo " + marca + " con " + dientes + " dientes.");
	}

	@Override
	public void desplazarse(float distancia) {
		System.out.println(marca + " trota " + distancia + " metros");
		
	}
	
	

}
