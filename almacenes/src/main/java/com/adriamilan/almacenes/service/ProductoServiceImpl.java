package com.adriamilan.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.almacenes.dao.IProductoDAO;
import com.adriamilan.almacenes.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO productodao;

	@Override
	public List<Producto> listProductos() {
		return productodao.findAll();
	}

	@Override
	public Producto productoXID(Long id) {
		return productodao.findById(id).get();
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return productodao.save(producto);
	}

	@Override
	public Producto editProducto(Producto producto) {
		return productodao.save(producto);
	}

	@Override
	public String deleteProducto(Long id) {
		productodao.deleteById(id);
		return "Producto Eliminado";
	}
	
}
