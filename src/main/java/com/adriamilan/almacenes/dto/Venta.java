package com.adriamilan.almacenes.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="cajero")
	private Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name="mregistradoras")
	private MaquinaRegistradora mregistradoras;
	
	// Constuctor por defecto
	public Venta() {
		
	}

	/**
	 * @param id
	 * @param producto
	 * @param cajero
	 * @param maquinaRegistradora
	 */
	public Venta(Long id, Producto producto, Cajero cajero, MaquinaRegistradora maquinaRegistradora) {
		super();
		this.id = id;
		this.producto = producto;
		this.cajero = cajero;
		this.mregistradoras = maquinaRegistradora;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	/**
	 * @return the maquinaRegistradora
	 */
	public MaquinaRegistradora getMaquinaRegistradora() {
		return mregistradoras;
	}

	/**
	 * @param maquinaRegistradora the maquinaRegistradora to set
	 */
	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.mregistradoras = maquinaRegistradora;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", producto=" + producto + ", cajero=" + cajero + ", maquinaRegistradora="
				+ mregistradoras + "]";
	}
	
}
