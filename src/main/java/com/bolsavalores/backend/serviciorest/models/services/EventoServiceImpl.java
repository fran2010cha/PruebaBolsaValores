package com.bolsavalores.backend.serviciorest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsavalores.backend.serviciorest.models.dao.IEventoDao;
import com.bolsavalores.backend.serviciorest.models.entity.Evento;
import com.bolsavalores.backend.serviciorest.models.entity.InfoEvento;

@Service
public class EventoServiceImpl implements IEventoService  {
	
	@Autowired
	private IEventoDao eventoDao;
	@Override
	public List<Evento> findAll() {
		return (List<Evento>) eventoDao.findAll();
	}
	@Override
	public Evento Save(Evento evento) {
		return eventoDao.save(evento);
	}
	@Override
	public Evento findById(Long id) {
		return eventoDao.findById(id).orElse(null);
	}
	@Override
	public List<Evento> findByPlataform(Long id) {
		return eventoDao.findByPlataform(id);
	}

}
