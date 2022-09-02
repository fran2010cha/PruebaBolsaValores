package com.bolsavalores.backend.serviciorest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="plataformas")
public class Plataforma implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4525373131607250064L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String codigo;
	private String nombre;
	
//	@OneToMany(mappedBy = "plataforma" ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<Evento> eventos;
	
	
/*
	public Plataforma() {
		eventos = new ArrayList<Evento>();
	}
*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/*	
	public List<Evento> getEventos() {
		return eventos;
	}
	
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void addEvento(Evento evento) {
		eventos.add(evento);
	}
	*/
}
