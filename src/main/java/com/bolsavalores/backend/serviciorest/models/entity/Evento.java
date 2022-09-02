package com.bolsavalores.backend.serviciorest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "evento")
public class Evento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6245349983265140533L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_evento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Plataforma plataforma;
	
	private String descripcion;
	private double valor_unitario;
	private int cantidad_veces;
	@Temporal(TemporalType.DATE)
	private Date fecha_evento;
	
	@PrePersist
	public void inicializarFecha() {
		fecha_evento = new Date();
	}

	public Long getId_evento() {
		return id_evento;
	}
	
	public void setId_evento(Long id_evento) {
		this.id_evento = id_evento;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public int getCantidad_veces() {
		return cantidad_veces;
	}
	
	public void setCantidad_veces(int cantidad_veces) {
		this.cantidad_veces = cantidad_veces;
	}

	public Date getFecha_evento() {
		return fecha_evento;
	}

	public void setFecha_evento(Date fecha_evento) {
		this.fecha_evento = fecha_evento;
	}

}
