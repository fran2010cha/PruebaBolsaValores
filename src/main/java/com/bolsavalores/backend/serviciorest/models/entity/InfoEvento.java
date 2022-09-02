package com.bolsavalores.backend.serviciorest.models.entity;

import java.io.Serializable;
import java.util.Date;

public class InfoEvento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6066049677282454347L;

	private Long plataforma_id;
	private String nombre_plataforma;
	private Long id_evento;
	private String nombre_evento;
	private Date fecha;
	private int cantidad;
	private double costo;

	public Long getPlataforma_id() {
		return plataforma_id;
	}

	public void setPlataforma_id(Long plataforma_id) {
		this.plataforma_id = plataforma_id;
	}

	public String getNombre_plataforma() {
		return nombre_plataforma;
	}

	public void setNombre_plataforma(String nombre_plataforma) {
		this.nombre_plataforma = nombre_plataforma;
	}

	public Long getId_evento() {
		return id_evento;
	}

	public void setId_evento(Long id_evento) {
		this.id_evento = id_evento;
	}

	public String getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

}
