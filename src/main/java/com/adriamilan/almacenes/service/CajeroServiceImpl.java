package com.adriamilan.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.almacenes.dao.ICajeroDAO;
import com.adriamilan.almacenes.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO cajerodao;
	
	@Override
	public List<Cajero> listCajeros() {
		return cajerodao.findAll();
	}

	@Override
	public Cajero cajeroXID(Long id) {
		return cajerodao.findById(id).get();
	}

	@Override
	public Cajero saveCajero(Cajero cajero) {
		return cajerodao.save(cajero);
	}

	@Override
	public Cajero editCajero(Cajero cajero) {
		return cajerodao.save(cajero);
	}

	@Override
	public String deleteCajero(Long id) {
		cajerodao.deleteById(id);
		return "Cajero Eliminado";
	}

	
	
}
