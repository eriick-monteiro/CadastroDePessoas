package dev.bira.CadastroDePessoas.service;

import dev.bira.CadastroDePessoas.model.Tarefa;
import dev.bira.CadastroDePessoas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> getAll() {
        return tarefaRepository.findAll();
    }

    public Tarefa save(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void delete(Long id) {
        tarefaRepository.deleteById(id);
    }
}
