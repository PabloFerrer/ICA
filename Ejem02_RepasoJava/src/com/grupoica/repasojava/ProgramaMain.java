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
	 * La unidad b�sica de almacenamiento son los tipos primitivos y los objetos
	 * que est�n basados en clases. Las clsases son el molde, plantila, estructura que indica c�mo
	 * ser�n todos los objetos instanciados a partir de ella:
	 *  Sus variables miembro (campos, atributos, propiedades...) y sus m�todos (funciones propias)
	 *   - Encapsulaci�n: 
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
