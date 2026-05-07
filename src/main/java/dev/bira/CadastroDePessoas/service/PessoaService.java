package dev.bira.CadastroDePessoas.service;

import dev.bira.CadastroDePessoas.model.Pessoa;
import dev.bira.CadastroDePessoas.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    // Listando as pessoas
    public List<Pessoa> getAll() {
        return pessoaRepository.findAll();
    }

    // Criando uma pessoa
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Deletando uma pessoa
    public void delete(Long id) {
        pessoaRepository.deleteById(id);
    }
}
