package com.robinfood.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.entities.TipoPreguntas;

@Repository
public interface TipoPreguntasRepository extends JpaRepository<TipoPreguntas, Long> {

}
