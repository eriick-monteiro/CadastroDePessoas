package dev.bira.CadastroDePessoas.Pessoas;

import dev.bira.CadastroDePessoas.Tarefas.TarefaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // Entity transforma uma Classe em uma Entidade do Banco de Dados
@Table(name = "tb_cadastro_pessoa") // Table define o nome da tabela
@NoArgsConstructor // Cria o Constructor sem argumentos
@AllArgsConstructor // Cria o Constructor com todos os argumentos
@Data // Cria os Getters e os Setters
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private char sexo;

    // M2O - Uma Pessoa tem uma única Tarefa
    @ManyToOne
    @JoinColumn(name = "tarefas_id") // Foreign Key - Chave Estrangeira
    private TarefaModel tarefas;
}
