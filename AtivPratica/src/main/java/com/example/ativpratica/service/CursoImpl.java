package com.example.ativpratica.service;


import com.example.ativpratica.DTO.CursoDTO;
import com.example.ativpratica.DTO.DisciplinaDTO;
import com.example.ativpratica.entity.Curso;
import com.example.ativpratica.entity.Disciplina;
import com.example.ativpratica.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CursoImpl implements CursoInt{

    CursoRepository cursoRepository;

    @Override
    public Curso cadastrarCurso(CursoDTO cursoDTO) {
        Curso curso = new Curso(cursoDTO.nome(), cursoDTO.listaDeDisciplinas());
        return cursoRepository.save(curso);
    }
}
