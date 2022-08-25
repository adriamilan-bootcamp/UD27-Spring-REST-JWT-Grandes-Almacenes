package com.adriamilan.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.almacenes.dao.IMaquinaRegistradoraDAO;
import com.adriamilan.almacenes.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraService implements IMaquinaRegistradoraService {

	@Autowired
	IMaquinaRegistradoraDAO mrdao;

	@Override
	public List<MaquinaRegistradora> listMaquinaRegistradora() {
		return mrdao.findAll();
	}

	@Override
	public MaquinaRegistradora maquinaRegistradoraXID(Long id) {
		return mrdao.findById(id).get();
	}

	@Override
	public MaquinaRegistradora saveMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return mrdao.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora editMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return mrdao.save(maquinaRegistradora);
	}

	@Override
	public String deleteMaquinaRegistradora(Long id) {
		mrdao.deleteById(id);
		return "Maquina Registradora eliminada";
	}
	
}
