package com.robinfood.encuesta.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "respuestaEncuesta")
public class RespuestaEncuesta {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "fecha" )
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(name = "respuesta")
	private String respuesta;
	
	@ManyToOne()
	@JoinColumn(name = "encuesta")
	private Encuesta encuesta;
	
	@ManyToOne()
	@JoinColumn(name = "encuestado")
	private Encuestado encuestado;
	
	@ManyToOne()
	@JoinColumn(name = "pregunta")
	private Preguntas preguntas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Encuesta getEncuesta() {
		return encuesta;
	}

	public void setEncuesta(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

	public Encuestado getEncuestado() {
		return encuestado;
	}

	public void setEncuestado(Encuestado encuestado) {
		this.encuestado = encuestado;
	}

	public Preguntas getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Preguntas preguntas) {
		this.preguntas = preguntas;
	}

}
