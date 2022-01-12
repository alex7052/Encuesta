package com.robinfood.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.entities.Opciones;
import com.robinfood.encuesta.entities.Preguntas;

@Repository
public interface PreguntasRepositiry  extends JpaRepository<Preguntas, Long> {

}
