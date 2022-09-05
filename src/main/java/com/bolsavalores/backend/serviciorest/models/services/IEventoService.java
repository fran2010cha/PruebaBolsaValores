package com.bolsavalores.backend.serviciorest.models.services;

import java.util.List;

import com.bolsavalores.backend.serviciorest.models.entity.Evento;

public interface IEventoService {
	
	public List<Evento> findAll();
	
	public Evento Save(Evento evento);
	
	public Evento findById(Long id);
	
	public List<Evento>findByPlataform(Long id);

}
