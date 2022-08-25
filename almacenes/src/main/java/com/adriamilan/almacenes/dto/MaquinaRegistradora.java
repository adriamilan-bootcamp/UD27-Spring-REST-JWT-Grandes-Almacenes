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
@Table(name="maquinas_registradoras")
public class MaquinaRegistradora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="piso")
	private int piso;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="mregistradoras")
	private List<Venta> ventas;
	
	// Constructor por defecto
	public MaquinaRegistradora() {
		
	}

	/**
	 * @param id
	 * @param piso
	 */
	public MaquinaRegistradora(Long id, int piso) {
		super();
		this.id = id;
		this.piso = piso;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
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
		return "MaquinaRegistradora [id=" + id + ", piso=" + piso + "]";
	}
	
}
