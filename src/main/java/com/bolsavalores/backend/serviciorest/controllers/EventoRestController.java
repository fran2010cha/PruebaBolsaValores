package com.bolsavalores.backend.serviciorest.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsavalores.backend.serviciorest.models.entity.Evento;
import com.bolsavalores.backend.serviciorest.models.entity.InfoEvento;
import com.bolsavalores.backend.serviciorest.models.services.IEventoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EventoRestController {
	
	@Autowired
	private IEventoService eventoService;
	
	@GetMapping("/eventos")
	public List<Evento> index(){
		return eventoService.findAll();
	}
	
	@GetMapping("/eventos/{id}")
	public Evento show(@PathVariable Long id){
		return eventoService.findById(id);
	}
	
	@PostMapping("/eventos")
	@ResponseStatus(HttpStatus.CREATED)
	public Evento create(@RequestBody Evento evento){
		return eventoService.Save(evento);
	}
	
	@GetMapping("/plataformas/{id}")
	public  List<InfoEvento> showPlatafoms(@PathVariable Long id){
		InfoEvento infoEvento; 
		List<InfoEvento> ListinfoEvento= new ArrayList<>();
		for(Evento evento : eventoService.findByPlataform(id)) {
			infoEvento = new InfoEvento();
			infoEvento.setPlataforma_id(evento.getPlataforma().getId());
			infoEvento.setNombre_plataforma(evento.getPlataforma().getNombre());
			infoEvento.setId_evento(evento.getId_evento());
			infoEvento.setCantidad(evento.getCantidad_veces());
			infoEvento.setFecha(evento.getFecha_evento());
			infoEvento.setNombre_evento(evento.getDescripcion());
			infoEvento.setCosto(evento.getCantidad_veces()*evento.getValor_unitario());
			ListinfoEvento.add(infoEvento);
		}
		return ListinfoEvento;
	}
}