package com.example.ativpratica.service;

import com.example.ativpratica.DTO.DisciplinaDTO;
import com.example.ativpratica.entity.Disciplina;


public interface DisciplinaInt {

    Disciplina cadastrarDisciplina(DisciplinaDTO disciplinaDTO);
}
