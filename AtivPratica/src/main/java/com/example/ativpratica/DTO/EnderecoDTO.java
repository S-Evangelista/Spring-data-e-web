package com.example.ativpratica.DTO;

import jakarta.persistence.Column;
import org.springframework.web.bind.annotation.RequestMapping;


public record EnderecoDTO( String rua, Integer numero, String cidade, String estado,
                           String bairro, Long cep) {
}
