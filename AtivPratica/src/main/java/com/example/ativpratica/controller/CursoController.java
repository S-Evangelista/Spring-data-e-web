package com.example.ativpratica.controller;



import com.example.ativpratica.DTO.CursoDTO;
import com.example.ativpratica.entity.Curso;
import com.example.ativpratica.service.CursoImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
@AllArgsConstructor
public class CursoController {

    CursoImpl cursoImpl;

    @PostMapping
    public ResponseEntity<Curso> cadastrar(@RequestBody CursoDTO cursoDTO){
        return ResponseEntity.ok(cursoImpl.cadastrarCurso(cursoDTO));
    }
}
