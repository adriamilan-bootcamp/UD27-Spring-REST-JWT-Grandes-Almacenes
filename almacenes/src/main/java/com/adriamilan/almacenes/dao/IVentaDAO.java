package com.adriamilan.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.almacenes.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Long> {

}
