package com.adriamilan.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.almacenes.dao.IVentaDAO;
import com.adriamilan.almacenes.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaDAO ventadao;

	@Override
	public List<Venta> listVentas() {
		return ventadao.findAll();
	}

	@Override
	public Venta ventaXID(Long id) {
		return ventadao.findById(id).get();
	}

	@Override
	public Venta saveVenta(Venta venta) {
		return ventadao.save(venta);
	}

	@Override
	public Venta editVenta(Venta venta) {
		return ventadao.save(venta);
	}

	@Override
	public String deleteVenta(Long id) {
		ventadao.deleteById(id);
		return "Venta eliminada";
	}
	
}
