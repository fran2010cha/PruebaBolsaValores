package com.bolsavalores.backend.serviciorest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsavalores.backend.serviciorest.models.dao.IPlataformaDao;
import com.bolsavalores.backend.serviciorest.models.entity.Plataforma;

@Service
public class PlataformaServiceImpl implements IPlataformaService{
	
	@Autowired
	private IPlataformaDao plataformaDao;
	@Override
	public List<Plataforma> findAll() {
		return (List<Plataforma>) plataformaDao.findAll();
	}

}
