package com.adriamilan.almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.adriamilan.almacenes.dto.Venta;
import com.adriamilan.almacenes.service.VentaServiceImpl;

public class VentaController {

	@Autowired
	VentaServiceImpl ventaserv;
	
	@GetMapping("/ventas")
	public List<Venta> listVentas() {
		return ventaserv.listVentas();
	}
	
	@GetMapping("/venta/{id}")
	public Venta ventaXID(@PathVariable(name="id") Long id) {
		return ventaserv.ventaXID(id);
	}

	@PostMapping("/venta")
	public Venta saveVenta(@RequestBody Venta venta) {
		return ventaserv.saveVenta(venta);
	}
	
	@PutMapping("/venta/{id}")
	public Venta editVenta(@PathVariable(name="id") Long id, @RequestBody Venta venta) {
		Venta ventaSelected = new Venta();
		Venta ventaUpdated = new Venta();
		
		ventaSelected = ventaserv.ventaXID(id);
		ventaSelected.setCajero(venta.getCajero());
		ventaSelected.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		ventaSelected.setProducto(venta.getProducto());
		
		ventaUpdated = ventaserv.editVenta(ventaSelected);
		
		return ventaUpdated;
	}
	
	@DeleteMapping("/venta/{id}")
	public String deleteVenta(@PathVariable(name="id") Long id) {
		return ventaserv.deleteVenta(id);
	}
	
}
