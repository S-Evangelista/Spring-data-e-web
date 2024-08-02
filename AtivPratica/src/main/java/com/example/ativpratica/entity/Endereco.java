package com.example.ativpratica.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Endereco {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String rua;

    @Column(nullable = false, length = 15)
    private Integer numero;

    @Column(nullable = false, length = 200)
    private String cidade;

    @Column(nullable = false, length = 150)
    private String estado;

    @Column(nullable = false, length = 150)
    private String bairro;

    @Column(nullable = false, length = 150)
    private Long cep;

    public Endereco(String rua, String bairro, String cidade, Integer numero, String estado, Long cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.estado = estado;
        this.cep = cep;
        this.cidade = cidade;
    }
}
