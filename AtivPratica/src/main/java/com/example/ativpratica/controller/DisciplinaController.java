package com.example.ativpratica.controller;


import com.example.ativpratica.DTO.DisciplinaDTO;
import com.example.ativpratica.entity.Disciplina;
import com.example.ativpratica.service.DisciplinaImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplina")
@AllArgsConstructor
public class DisciplinaController {

    DisciplinaImpl disciplinaImpl;

    @PostMapping
    public ResponseEntity<Disciplina> cadastrar(@RequestBody DisciplinaDTO disciplinaDTO){
        return ResponseEntity.ok(disciplinaImpl.cadastrarDisciplina(disciplinaDTO));
    }

}
