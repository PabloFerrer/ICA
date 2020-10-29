package com.grupoica.repasojava.abstractas_interfaces;

public class Coche extends Vehiculo implements Motorizable {

	private float gasolina;
	
	public Coche(String marca, float peso, float gasolina) {
		super(marca, peso);
		this.gasolina = gasolina;
	}

	public float getGasolina() {
		return gasolina;
	}

	public void setGasolina(float gasolina) {
		this.gasolina = gasolina;
	}

	@Override
	public void aceleracion() {
		System.out.println("Acelerando coche " + marca);
	}

	@Override
	public void desplazarse(float distancia) {
		System.out.println(marca + " rueda " + distancia + " metros");
		
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo coche " + marca );
		
	}
	
	
	
	
}
