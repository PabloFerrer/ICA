package com.grupoica.repasojava.modelo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Clase que se encargará de las operaciones C.R.U.D.
 * Create Read Update Delete
 */
public class GestionUsuarios {
	
	private ArrayList<Usuario> listaUsuarios;

	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList<Usuario>();
		
		/*if (l.isTipoLocura()) {
			System.out.println("Esta loco" + l.toString());
		}else {
			System.out.println("No esta loco" + l.toString());
		}*/
	}
	
	public void listarUsuarios() {
		for (Usuario usuO : listaUsuarios) {
			Usuario usu = usuO;
			System.out.println("Nombre " + usu.getNombre());
		}
		/*for(int i = 0;i<listaUsuarios.size();i++) {
			System.out.println(this.listaUsuarios.get(i));
		}*/
	}
	
	public void addUsuario(Usuario usu) {
		this.listaUsuarios.add(usu);
	}
	
	public void mostrarUsuario(String nombre) {
		
		for (Usuario usu : listaUsuarios) {
			// if (usuObj instanceof Usuario) {
				// Casting de objetos gracias al poliformismo
				//Usuario usu = (Usuario) usuObj;	 
				if (usu.getNombre().equals(nombre)) {
					System.out.println("ENCONTRADO: " + usu.getNombre());				
				}
			// }
		}
	}
	

	
	public void deleteUsers() {
		for(int i = listaUsuarios.size()-1; i>=0;i--) {
			listaUsuarios.remove(i);
		}
		System.out.println("El tamaño del array es: " + listaUsuarios.size());
	}
	
	public void deleteUser(Usuario u) {
		for(int i = 0; i<listaUsuarios.size();i++) {
			if(listaUsuarios.get(i).getNombre() == u.getNombre()) {
				listaUsuarios.remove(i);
			}
		}
	}
	
	public void filtrarEdad(int num) {
		for(int i = 0; i<listaUsuarios.size();i++) {
			if(listaUsuarios.get(i).getEdad() == num ) {
				System.out.println("El usuario " + listaUsuarios.get(i).getNombre() + " tiene " + num
						+ " años.");
			}
		}
	}
	
	public void filtrarEdad2(int num, int num2) {
		for(int i = 0; i<listaUsuarios.size();i++) {
			if(listaUsuarios.get(i).getEdad() > num && listaUsuarios.get(i).getEdad() < num2 ) {
				System.out.println("El usuario " + listaUsuarios.get(i).getNombre() + " tiene entre " 
			+ num + " y " + num2 + " años.");
			}
		}
	}
	
	public Usuario modificarUsuario(Usuario u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que deseas modificar? \n 1:Nombre\n2:Edad\n3:Nombre y edad");
		switch(sc.nextInt()) {
		case 1:
			u.setNombre(sc.next());
			System.out.println("El nuevo nombre del usuario es: " + u.getNombre());
		case 2:
			u.setEdad(sc.nextInt());
		case 3: 
			u.setNombre(sc.next());
			u.setEdad(sc.nextInt());
			System.out.println("El nuevo nombre del usuario es: " + u.getNombre() + "\n Y su nueva"
					+ " edad es " + u.getEdad());
			
		}
		
		return u;
	}
	
	public void eliminarUsuario(String nombre) {
		
		for(Usuario usu: listaUsuarios) {
			if(usu.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Usuario eliminado: " + nombre);
				
			}
		}
		
	}
	

}

