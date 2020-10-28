package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.GestionUsuarios;
import com.grupoica.repasojava.modelo.Loco;
import com.grupoica.repasojava.modelo.Usuario;

public class ProgramaMain {
	
	/*
	 * JS
	 * En JS no hay clases, es un lenguaje basado en prototipos:
	 * Que son objetos que sirven de base para clonar nuevos objetos
	 * 
	 * 
	 * Java
	 * La unidad básica de almacenamiento son los tipos primitivos y los objetos
	 * que están basados en clases. Las clsases son el molde, plantila, estructura que indica cómo
	 * serán todos los objetos instanciados a partir de ella:
	 *  Sus variables miembro (campos, atributos, propiedades...) y sus métodos (funciones propias)
	 *   - Encapsulación: 
	 *   - Herencia
	 *   - Polimorfismo
	 */
	public static void main(String[] args) {
		GestionUsuarios gesUsu = new GestionUsuarios();
		Usuario u = new Usuario("Pepe",10);
		Usuario u2 = new Usuario("Juan", 20);
		
		gesUsu.addUsuario(u);
		gesUsu.addUsuario(u2);
		gesUsu.addUsuario(new Usuario("dsad", 15));
		
		gesUsu.filtrarEdad(10);
		gesUsu.filtrarEdad2(0, 30);
		gesUsu.deleteUsers();;
		gesUsu.deleteUser(u2);
		//u = gesUsu.modificarUsuario(u);
		
		/*Loco l = new Loco();
		l.setNombre("Joker");
		l.setTipoLocura(true);*/
		//gesUsu.listarUsuarios();
//		EjemploMemoria.pruebaPasoPorValor();
		//EjemploMemoria.pruebaPasoPorReferencia();
	}

}
