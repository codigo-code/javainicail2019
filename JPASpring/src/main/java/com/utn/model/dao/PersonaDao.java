package com.utn.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.model.entity.Persona;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Integer> {

}
