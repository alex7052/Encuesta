package com.robinfood.encuesta.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "preguntas")
public class Preguntas {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne()
	@JoinColumn(name = "tipoPregunta")
	private TipoPreguntas tipoPregunta;
	
	@OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
	private List<Opciones> opciones;
	
	@JsonIgnore
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "encuesta_preguntas",
            joinColumns = {@JoinColumn(name = "id_pregunta")},
            inverseJoinColumns = {@JoinColumn(name = "id_encuesta")}
    )
	private List<Encuesta> encuesta;
	
	@JsonIgnore
	@OneToMany(mappedBy = "preguntas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

	public TipoPreguntas getTipoPregunta() {
		return tipoPregunta;
	}

	public void setTipoPregunta(TipoPreguntas tipoPregunta) {
		this.tipoPregunta = tipoPregunta;
	}

	public List<Opciones> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<Opciones> opciones) {
		this.opciones = opciones;
	}

	public List<Encuesta> getEncuesta() {
		return encuesta;
	}

	public void setEncuesta(List<Encuesta> encuesta) {
		this.encuesta = encuesta;
	}

	public List<RespuestaEncuesta> getRespuestaEncuesta() {
		return respuestaEncuesta;
	}

	public void setRespuestaEncuesta(List<RespuestaEncuesta> respuestaEncuesta) {
		this.respuestaEncuesta = respuestaEncuesta;
	}


	
}
