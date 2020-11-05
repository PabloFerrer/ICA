package com.grupoica.appspring.modelo.apirest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoica.appspring.modelo.daos.HeroesDAO;
import com.grupoica.appspring.modelo.entidades.Heroe;

@RestController
@RequestMapping("/api/heroes")
@CrossOrigin
public class ControladorHeroes {
	
	@Autowired
	HeroesDAO heroesDAO;
	
	@RequestMapping(method = RequestMethod.GET,value="/prueba")
	public Heroe leerHeroe() {
		System.out.println("Peticion recibida");
		Heroe heroe = new Heroe();
		heroe.setNombre("Hulk");
		return heroe;
	}
	@PostMapping
	public Heroe guardarHeroe(@RequestBody Heroe nuevoHeroe) {
		System.out.println("Heroe recibido" + nuevoHeroe.getNombre());
		return heroesDAO.save(nuevoHeroe);
	}
	@PutMapping
	public Heroe actualizar(@RequestBody Heroe nuevoHeroe) {
		if(nuevoHeroe.getId() >0) {
			System.out.println("Heroe recibido" + nuevoHeroe.getNombre());
			return heroesDAO.save(nuevoHeroe);
		}else {
			System.out.println("Heroe sin id" + nuevoHeroe.getNombre());
			return null;
		}	
	}
	@DeleteMapping
	public void eliminar(@RequestBody Heroe heroe) {
		if(heroe.getId()>0) {
			
			heroesDAO.delete(heroe);
		}else {
			
		}	
	}
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void eliminarporID(@PathVariable int id) {
		if(id >0) {
			
			heroesDAO.deleteById(id);
		}else {
			
		}	
	}
	@RequestMapping(value="{id}",method = RequestMethod.GET)
	public Heroe getUno(int id) {
		if(id >0) {
			
		return	heroesDAO.findById(id).get();
		}else {
			System.out.println("Sin id" + id);
			return null;
		}
		 
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Heroe> getAll() {	
		return	heroesDAO.findAll();	
	}
}
