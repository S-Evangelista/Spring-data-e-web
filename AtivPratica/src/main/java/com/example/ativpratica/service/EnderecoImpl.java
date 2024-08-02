package com.example.ativpratica.service;

import com.example.ativpratica.DTO.EnderecoDTO;
import com.example.ativpratica.entity.Endereco;
import com.example.ativpratica.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class EnderecoImpl implements EnderecoInt{

    EnderecoRepository enderecoRepository;


    @Override
    public Endereco buscarEnderecoPorID(Long id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public List<Endereco> buscarTodosEndereco() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco cadastrarEndereco(EnderecoDTO enderecoDTO) {
        Endereco endereco = new Endereco(enderecoDTO.rua(), enderecoDTO.bairro(),  enderecoDTO.cidade(), enderecoDTO.numero(), enderecoDTO.estado(), enderecoDTO.cep());
        return enderecoRepository.save(endereco);
    }

    @Override
    public String deletarEndereco(Long id) {
        if (enderecoRepository.existsById(id)) {
            enderecoRepository.deleteById(id);
        }
        return "Endereco deletado";
    }

    @Override
    public Endereco atualizarEndereco(Endereco endereco) {
        validarEndereco(endereco.getId());
        return enderecoRepository.save(endereco);
    }

    private void validarEndereco(Long id){
        if(!enderecoRepository.existsById(id)){
            throw new RuntimeException("Este endereco não existe no sistema");
        }
    }
}
