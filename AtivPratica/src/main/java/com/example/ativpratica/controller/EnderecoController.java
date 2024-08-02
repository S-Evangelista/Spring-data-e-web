package com.example.ativpratica.controller;

import com.example.ativpratica.DTO.EnderecoDTO;
import com.example.ativpratica.entity.Endereco;
import com.example.ativpratica.service.EnderecoImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor
public class EnderecoController {

    EnderecoImpl enderecoImpl;

    @PostMapping
    public ResponseEntity<Endereco> cadastrar(@RequestBody EnderecoDTO enderecoDTO){
        return ResponseEntity.ok(enderecoImpl.cadastrarEndereco(enderecoDTO));
    }
}
