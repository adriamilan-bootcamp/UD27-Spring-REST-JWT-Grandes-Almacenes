package com.adriamilan.almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.almacenes.dto.Cajero;
import com.adriamilan.almacenes.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroserv;
	
	@GetMapping("/cajeros")
	public List<Cajero> listCajeros() {
		return cajeroserv.listCajeros();
	}
	
	@GetMapping("/cajero{id}")
	public Cajero cajeroXID(@PathVariable(name="id") Long id) {
		return cajeroserv.cajeroXID(id);
	}
	
	@PostMapping("/cajero")
	public Cajero saveCajero(@RequestBody Cajero cajero) {
		return cajeroserv.saveCajero(cajero);
	}
	
	@PutMapping("/cajero/{id}") 
	public Cajero editCajero(@PathVariable(name="id") Long id, @RequestBody Cajero cajero) {	
		Cajero cajeroSelected = new Cajero();
		Cajero cajeroUpdated = new Cajero();
		
		cajeroSelected = cajeroserv.cajeroXID(id);
		cajeroSelected.setNombre(cajero.getNombre());
		
		cajeroUpdated = cajeroserv.editCajero(cajeroSelected);
		
		return cajeroUpdated;
	}
	
	@DeleteMapping("/cajero/{id}")
	public String deleteCajero(@PathVariable(name="id") Long id) {
		return cajeroserv.deleteCajero(id);
	}
	
}
