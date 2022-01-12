package com.robinfood.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.entities.Encuestado;

@Repository
public interface EncuestadoRepository  extends JpaRepository<Encuestado, Long> {

}
