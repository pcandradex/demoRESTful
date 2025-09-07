package com.example.demoRESTful.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeTarefa;
    private LocalDate dataEntrega;
    private String responsavel;

    public Tarefa() {}

    public Tarefa(String nomeTarefa, LocalDate dataEntrega, String responsavel) {
        this.nomeTarefa = nomeTarefa;
        this.dataEntrega = dataEntrega;
        this.responsavel = responsavel;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nomeTarefa; }
    public void setNome(String nomeTarefa) { this.nomeTarefa = nomeTarefa; }

    public LocalDate getDataEntrega() { return dataEntrega; }
    public void setDataEntrega(LocalDate dataEntrega) { this.dataEntrega = dataEntrega; }

    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}
