package com.robinfood.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.entities.Opciones;

@Repository
public interface OpcionesRepository  extends JpaRepository<Opciones, Long> {

}
