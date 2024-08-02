package com.example.ativpratica.service;

import com.example.ativpratica.DTO.EnderecoDTO;
import com.example.ativpratica.entity.Endereco;

import java.util.List;

public interface EnderecoInt {

    Endereco buscarEnderecoPorID(Long id);

    List<Endereco> buscarTodosEndereco();

    Endereco cadastrarEndereco(EnderecoDTO enderecoDTO);

    String deletarEndereco(Long id);

    Endereco atualizarEndereco(Endereco endereco);
}
