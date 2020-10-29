package com.grupoica.repasojava.abstractas_interfaces;

import java.util.ArrayList;

public class ProbandoVehiculos {
	
	public static void probar() {
		Coche miCoche = new Coche("Kia", 1500, 60);
		Patinete miPatinete = new Patinete("15A");
		Caballo miCaballo = new Caballo("Unicornio", 1500, 60,"Heno");
		Perro miPerro = new Perro("Pienso");
		
		miCaballo.aceleracion();
		
		ArrayList<Motorizable> garaje = new ArrayList<>();
		ArrayList<Animal> granja = new ArrayList<>();
		
		garaje.add(miCoche);
		garaje.add(miPatinete);
		
		granja.add(miCaballo);
		granja.add(miPerro);
		
		for (Motorizable m : garaje) {
			m.encender();
			if(m.getClass() == Coche.class) {
				Coche m2 = (Coche)m;
				m2.aceleracion();	
			}
		}
		
		for (Animal a : granja) {
			a.alimentarse();

		}
		
		/*
		//Como vehiculo es abstracta no podemos instanciar un objeto de esa clase.
		//garaje.add(new Vehiculo("Que nos he comprado",30));
		
		for (Vehiculo v : garaje) {
			v.aceleracion();
			v.desplazarse(50f);
		}
		miCoche.encender();
		Motorizable vehMotor = miCoche;
		vehMotor.encender();*/
	}
}
