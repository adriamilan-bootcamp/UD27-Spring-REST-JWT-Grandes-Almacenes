package com.adriamilan.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.almacenes.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Long> {

}
