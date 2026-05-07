package dev.bira.CadastroDePessoas.controller;

import dev.bira.CadastroDePessoas.model.Pessoa;
import dev.bira.CadastroDePessoas.service.PessoaService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
@Data
public class PessoaController {

    // Injeção de dependência via anotation (pode ser feita via construtor)
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> getAll() {
        return pessoaService.getAll();
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pessoaService.delete(id);
    }
}