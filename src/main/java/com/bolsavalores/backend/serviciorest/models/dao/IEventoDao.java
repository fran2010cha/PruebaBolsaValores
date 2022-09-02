package com.bolsavalores.backend.serviciorest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsavalores.backend.serviciorest.models.entity.Evento;
import com.bolsavalores.backend.serviciorest.models.entity.InfoEvento;

public interface IEventoDao extends CrudRepository<Evento, Long>{
	
	@Query("select u from Evento u where u.plataforma.id = ?1")
	List<Evento> findByPlataform(Long id);
}
