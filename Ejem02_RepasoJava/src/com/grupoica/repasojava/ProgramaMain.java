package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.GestionUsuarios;
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
		Usuario usu = new Usuario("Hola",10);
		gesUsu.addUsuario(usu);
		gesUsu.listarUsuarios();
		
		//EjemploMemoria.pruebaPasoPorValor();
		EjemploMemoria.pruebaPasoPorReferencia();
	}

}
