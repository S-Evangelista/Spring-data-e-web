package com.example.ativpratica.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @OneToMany
    private List<Disciplina> listaDeDisciplinas;

    public Curso(String nome, List<Disciplina> listaDeDisciplinas) {

        this.nome = nome;
        this.listaDeDisciplinas = listaDeDisciplinas;
    }
}
