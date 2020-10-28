package com.grupoica.repasojava.modelo;

import java.util.ArrayList;

/*
 * Clase que se encargará de las operaciones C.R.U.D.
 * Create Read Update Delete
 */
public class GestionUsuarios {
	
	public ArrayList listaUsuarios;

	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList();
		this.listaUsuarios.add(10);
		Usuario usu = new Usuario();
		usu.setEdad(50);
		usu.setNombre("Usu2");
		//System.out.println("Nombre " + usu.getNombre());
		this.listaUsuarios.add(usu);
		
		Usuario usu2 = new Usuario("Usu2",50);
		//System.out.println("Edad usu2: " + usu2.getEdad());
		
		this.listaUsuarios.add("Texto");
		this.listaUsuarios.add(new Object());
		if(usu.equals(usu2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
		Loco l = new Loco();
		System.out.println(l.getNombre());
	}
	
	public void listarUsuarios() {
		for(int i = 0;i<listaUsuarios.size();i++) {
			System.out.println(this.listaUsuarios.get(i));
		}
	}
	
	public void addUsuario(Usuario usu) {
		this.listaUsuarios.add(usu);
	}
	
}

