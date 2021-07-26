package com.dio.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.controle.model.JornadaTrabalho;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}