package com.adriamilan.almacenes.service;

import java.util.List;

import com.adriamilan.almacenes.dto.Cajero;

public interface ICajeroService {
	
	public List<Cajero> listCajeros();
	
	public Cajero cajeroXID(Long id);
	
	public Cajero saveCajero(Cajero cajero);
	
	public Cajero editCajero(Cajero cajero);
	
	public String deleteCajero(Long id);
	
}
