package com.grupoica.repasojava.modelo;

public class Loco extends Usuario {
	private boolean tipoLocura;
	
	public Loco() {
		super();
	}
	
	public boolean isTipoLocura() {
		return tipoLocura;
	}

	public void setTipoLocura(boolean tipoLocura) {
		this.tipoLocura = tipoLocura;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


}
