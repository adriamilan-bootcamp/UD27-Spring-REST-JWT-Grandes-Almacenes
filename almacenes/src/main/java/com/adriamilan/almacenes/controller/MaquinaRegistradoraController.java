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

import com.adriamilan.almacenes.dto.MaquinaRegistradora;
import com.adriamilan.almacenes.service.MaquinaRegistradoraService;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraService mrservice;
	
	@GetMapping("/maquinasregistradoras")
	public List<MaquinaRegistradora> listMR() {
		return mrservice.listMaquinaRegistradora();
	}
	
	@GetMapping("/maquinaregistradora/{id}")
	public MaquinaRegistradora mrXID(@PathVariable(name="id") Long id) {
		return mrservice.maquinaRegistradoraXID(id);
	}
	
	@PostMapping("/maquinaregistradora")
	public MaquinaRegistradora saveMR(@RequestBody MaquinaRegistradora mreg) {
		return mrservice.saveMaquinaRegistradora(mreg);
	}
	
	@PutMapping("/maquinaregistradora/{id}")
	public MaquinaRegistradora editMR(@PathVariable(name="id") Long id, @RequestBody MaquinaRegistradora mreg) {
		MaquinaRegistradora mrSel = new MaquinaRegistradora();
		MaquinaRegistradora mrUpd = new MaquinaRegistradora();
		
		mrSel = mrservice.maquinaRegistradoraXID(id);
		mrSel.setPiso(mreg.getPiso());
		
		mrUpd = mrservice.editMaquinaRegistradora(mrSel);
		
		return mrUpd;
	}
	
	@DeleteMapping("/maquinaregistradora/{id}")
	public String deleteMR(@PathVariable(name="id") Long id) {
		return mrservice.deleteMaquinaRegistradora(id);
	}
	
}
