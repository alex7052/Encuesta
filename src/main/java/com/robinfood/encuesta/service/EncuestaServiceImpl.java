package com.robinfood.encuesta.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robinfood.encuesta.dto.RequestEncuesta;
import com.robinfood.encuesta.entities.Encuesta;
import com.robinfood.encuesta.entities.RespuestaEncuesta;
import com.robinfood.encuesta.repository.EncuestaRepository;
import com.robinfood.encuesta.repository.EncuestadoRepository;
import com.robinfood.encuesta.repository.PreguntasRepositiry;
import com.robinfood.encuesta.repository.RespuestaEncuestaRepository;

@Service
public class EncuestaServiceImpl implements EncuestaService {

	@Autowired
	private EncuestaRepository encuestaRepository;
	
	@Autowired
	private RespuestaEncuestaRepository respuestaEncuestaRepository;
	
	@Autowired
	private EncuestadoRepository encuestadoRepository;
	
	@Autowired
	private PreguntasRepositiry preguntasRepository;
	
	@Override
	public Encuesta getEncuesta(long id) {
		
		return encuestaRepository.findById(id).orElse(null);
	}

	@Override
	public void registrarEncuesta(List<RequestEncuesta> encuesta) {
		
		for(RequestEncuesta r : encuesta) {
			
			RespuestaEncuesta res = new RespuestaEncuesta();
			res.setFecha(new Date());
			res.setEncuesta(encuestaRepository.findById(r.getEncuesta()).get());
			res.setEncuestado(encuestadoRepository.findById(r.getEncuestado()).get());
			res.setPreguntas(preguntasRepository.findById(r.getPregunta()).get());
			res.setRespuesta(r.getRespuesta());
			
			respuestaEncuestaRepository.save(res);
			
		}
		
	}

}
