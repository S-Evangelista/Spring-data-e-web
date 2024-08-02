package com.example.ativpratica.service;

import com.example.ativpratica.DTO.CursoDTO;
import com.example.ativpratica.DTO.DisciplinaDTO;
import com.example.ativpratica.entity.Curso;
import com.example.ativpratica.entity.Disciplina;

public interface CursoInt {

    Curso cadastrarCurso(CursoDTO CursoDTO);

}
