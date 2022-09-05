package com.bolsavalores.backend.serviciorest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsavalores.backend.serviciorest.models.entity.Plataforma;

public interface IPlataformaDao extends CrudRepository<Plataforma, Long>{
	
}
