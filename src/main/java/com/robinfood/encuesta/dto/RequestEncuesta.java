package com.robinfood.encuesta.dto;

public class RequestEncuesta {

	private String respuesta;
	private long encuesta;
	private long encuestado;
	private long pregunta;
	
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public long getEncuesta() {
		return encuesta;
	}
	public void setEncuesta(long encuesta) {
		this.encuesta = encuesta;
	}
	public long getEncuestado() {
		return encuestado;
	}
	public void setEncuestado(long encuestado) {
		this.encuestado = encuestado;
	}
	public long getPregunta() {
		return pregunta;
	}
	public void setPregunta(long pregunta) {
		this.pregunta = pregunta;
	}
}
