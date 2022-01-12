package com.robinfood.encuesta.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "encuesta")
public class Encuesta {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToMany(mappedBy = "encuesta")
	private List<Preguntas> preguntas;
	
	@JsonIgnore
	@OneToMany(mappedBy = "encuesta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<RespuestaEncuesta> respuestaEncuesta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Preguntas> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<Preguntas> preguntas) {
		this.preguntas = preguntas;
	}

	public List<RespuestaEncuesta> getRespuestaEncuesta() {
		return respuestaEncuesta;
	}

	public void setRespuestaEncuesta(List<RespuestaEncuesta> respuestaEncuesta) {
		this.respuestaEncuesta = respuestaEncuesta;
	}
	
	
}
