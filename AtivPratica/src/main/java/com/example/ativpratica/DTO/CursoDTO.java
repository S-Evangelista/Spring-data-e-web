package com.example.ativpratica.DTO;

import com.example.ativpratica.entity.Disciplina;

import java.util.List;

public record CursoDTO(String nome, List<Disciplina> listaDeDisciplinas) {
}
