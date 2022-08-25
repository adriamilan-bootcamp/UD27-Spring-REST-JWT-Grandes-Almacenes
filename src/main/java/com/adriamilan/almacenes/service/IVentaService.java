package com.adriamilan.almacenes.service;

import java.util.List;

import com.adriamilan.almacenes.dto.Venta;

public interface IVentaService {

	public List<Venta> listVentas();
	
	public Venta ventaXID(Long id);
	
	public Venta saveVenta(Venta venta);
	
	public Venta editVenta(Venta venta);
	
	public String deleteVenta(Long id);
	
}
