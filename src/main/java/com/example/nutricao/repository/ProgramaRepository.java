package com.example.nutricao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutricao.model.Programa;

@Repository
public interface ProgramaRepository extends JpaRepository<Programa, Integer> {

}
