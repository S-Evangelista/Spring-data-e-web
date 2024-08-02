package com.example.ativpratica.service;

import com.example.ativpratica.DTO.DisciplinaDTO;
import com.example.ativpratica.entity.Disciplina;
import com.example.ativpratica.repository.DisciplinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DisciplinaImpl implements DisciplinaInt {

    DisciplinaRepository disciplinaRepository;

    @Override
    public Disciplina cadastrarDisciplina(DisciplinaDTO disciplinaDTO) {
        Disciplina disciplina = new Disciplina(disciplinaDTO.nome());
        return disciplinaRepository.save(disciplina);
    }

//, disciplinaDTO.listaDeProfessores()
}
