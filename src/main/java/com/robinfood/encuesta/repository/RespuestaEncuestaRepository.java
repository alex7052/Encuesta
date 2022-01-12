package com.robinfood.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.entities.RespuestaEncuesta;

@Repository
public interface RespuestaEncuestaRepository  extends JpaRepository<RespuestaEncuesta, Long> {

}
