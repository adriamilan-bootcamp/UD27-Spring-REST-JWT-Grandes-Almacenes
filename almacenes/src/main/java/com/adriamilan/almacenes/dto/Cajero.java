package com.adriamilan.almacenes.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cajeros")
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombreApellidos")
	private String nombreApellidos;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="cajero")
	private List<Venta> ventas;

	// Constructor por defecto
	public Cajero() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Cajero(Long id, String nombre) {
		super();
		this.id = id;
		this.nombreApellidos = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreApellidos;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombreApellidos = nombre;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	
	/**
	 * @return the ventas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVentas() {
		return ventas;
	}

	/**
	 * @param ventas the ventas to set
	 */
	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	
	@Override
	public String toString() {
		return "Cajero [id=" + id + ", nombre=" + nombreApellidos + "]";
	}
	
}
