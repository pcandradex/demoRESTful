package com.example.demoRESTful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoRESTful.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
