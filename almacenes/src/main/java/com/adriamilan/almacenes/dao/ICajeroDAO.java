package com.adriamilan.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.almacenes.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Long> {

}
