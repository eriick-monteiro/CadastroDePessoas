package dev.bira.CadastroDePessoas.repository;

import dev.bira.CadastroDePessoas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
