package com.robinfood.encuesta.service;

import java.util.List;

import com.robinfood.encuesta.dto.RequestEncuesta;
import com.robinfood.encuesta.entities.Encuesta;

public interface EncuestaService {
	
	public Encuesta getEncuesta(long id);
	public void registrarEncuesta(List<RequestEncuesta> encuesta);

}
