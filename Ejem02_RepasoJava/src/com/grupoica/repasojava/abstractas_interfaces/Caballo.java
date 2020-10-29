package com.grupoica.repasojava.abstractas_interfaces;

public class Caballo extends Vehiculo implements Animal{

	private int dientes;
	private String comida;
	
	public Caballo(String marca, float peso, int dientes,String comida) {
		super(marca, peso);
		this.dientes = dientes;
		this.comida = comida;
		// TODO Auto-generated constructor stub
	}
	
	public int getDientes() {
		return dientes;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
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

	@Override
	public void alimentarse() {
		System.out.println("Caballo comiendo " + comida);
		
	}
	
	

}
