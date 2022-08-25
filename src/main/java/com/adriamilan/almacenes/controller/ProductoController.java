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

import com.adriamilan.almacenes.dto.Producto;
import com.adriamilan.almacenes.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl productoserv;
	
	@GetMapping("/productos")
	public List<Producto> listProductos() {
		return productoserv.listProductos();
	}
	
	@GetMapping("/producto/{id}")
	public Producto productoXID(@PathVariable(name="id") Long id) {
		return productoserv.productoXID(id);
	}
	
	@PostMapping("/producto")
	public Producto saveProducto(@RequestBody Producto producto) {
		return productoserv.saveProducto(producto);
	}
	
	@PutMapping("/producto/{id}")
	public Producto editProducto(@PathVariable(name="id") Long id, @RequestBody Producto producto) {
		Producto productoSelected = new Producto();
		Producto productoUpdated = new Producto();
		
		productoSelected = productoserv.productoXID(id);
		productoSelected.setNombre(producto.getNombre());
		productoSelected.setPrecio(producto.getPrecio());
		
		productoUpdated = productoserv.editProducto(productoSelected);
		
		return productoUpdated;
	}
	
	@DeleteMapping("/producto/{id}")
	public String deleteProducto(@PathVariable(name="id") Long id) {
		return productoserv.deleteProducto(id);
	}
	
}
