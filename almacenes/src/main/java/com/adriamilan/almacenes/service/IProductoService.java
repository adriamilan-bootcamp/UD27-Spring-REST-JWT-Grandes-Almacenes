package com.adriamilan.almacenes.service;

import java.util.List;

import com.adriamilan.almacenes.dto.Producto;

public interface IProductoService {

	public List<Producto> listProductos();
	
	public Producto productoXID(Long id);
	
	public Producto saveProducto(Producto producto);
	
	public Producto editProducto(Producto producto);
	
	public String deleteProducto(Long id);
	
}
