package com.bolsavalores.backend.serviciorest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsavalores.backend.serviciorest.models.entity.Plataforma;
import com.bolsavalores.backend.serviciorest.models.services.IPlataformaService;

@CrossOrigin(origins = {"https://prueba-bolsa-valores.web.app"})
@RestController
@RequestMapping("/plataformas")
public class PlataformaRestController {
	
	@Autowired
	private IPlataformaService plataformaService;
	
	@GetMapping("/all")
	public List<Plataforma> index(){
		return plataformaService.findAll();
	}
}
