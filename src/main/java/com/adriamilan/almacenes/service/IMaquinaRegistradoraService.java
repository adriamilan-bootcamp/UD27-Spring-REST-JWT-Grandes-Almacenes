package com.adriamilan.almacenes.service;

import java.util.List;

import com.adriamilan.almacenes.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	public List<MaquinaRegistradora> listMaquinaRegistradora();
	
	public MaquinaRegistradora maquinaRegistradoraXID(Long id);
	
	public MaquinaRegistradora saveMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	
	public MaquinaRegistradora editMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	
	public String deleteMaquinaRegistradora(Long id);
	
}
