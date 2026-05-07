package dev.bira.CadastroDePessoas.controller;

import dev.bira.CadastroDePessoas.model.Tarefa;
import dev.bira.CadastroDePessoas.service.TarefaService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
@Data
public class TarefaController {

    private final TarefaService tarefaService;

    // Injetando dependência via construtor (pode ser feita por anotation)

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public List<Tarefa> getAll() {
        return tarefaService.getAll();
    }

    @PostMapping
    public Tarefa create(@RequestBody Tarefa tarefa) {
        return tarefaService.save(tarefa);
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable Long id) {
        tarefaService.delete(id);
    }

}
