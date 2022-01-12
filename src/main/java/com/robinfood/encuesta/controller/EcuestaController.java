package com.robinfood.encuesta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.robinfood.encuesta.dto.RequestEncuesta;
import com.robinfood.encuesta.entities.Encuesta;
import com.robinfood.encuesta.service.EncuestaService;

@RestController
public class EcuestaController {

	@Autowired
	private EncuestaService encuestaService;
	
	@GetMapping(value = "/verEncuesta/{id}", produces = "application/json; charset=UTF-8")
	public Encuesta ver(@PathVariable Long id) {
		
		Encuesta e = encuestaService.getEncuesta(id);
		return e;
	}
	
	
	@PostMapping("/crearEncuesta")
	@ResponseStatus(HttpStatus.CREATED)
	public void crear(@RequestBody List<RequestEncuesta> p) {
				
		 encuestaService.registrarEncuesta(p);
	}
	
}
