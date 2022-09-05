package com.bolsavalores.backend.serviciorest.models.services;

import java.util.List;

import com.bolsavalores.backend.serviciorest.models.entity.Plataforma;

public interface IPlataformaService {
	
	public List<Plataforma> findAll();
}
