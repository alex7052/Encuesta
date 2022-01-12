package com.robinfood.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.entities.Encuesta;

@Repository
public interface EncuestaRepository  extends JpaRepository<Encuesta, Long> {

}
