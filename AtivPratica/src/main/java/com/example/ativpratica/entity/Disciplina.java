package com.example.ativpratica.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Disciplina {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @ManyToMany
    private List<Professor> listaDeProfessores;


    public Disciplina(String nome) { //, List<Professor> listaDeProfessores
        this.nome = nome;
       // this.listaDeProfessores = listaDeProfessores;
    }
}

