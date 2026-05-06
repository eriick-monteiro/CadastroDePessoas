package dev.bira.CadastroDePessoas.Pessoas;

import dev.bira.CadastroDePessoas.Tarefas.TarefaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity // Entity transforma uma Classe em uma Entidade do Banco de Dados
@Table(name = "tb_cadastro_pessoa") // Table define o nome da tabela
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

    public PessoaModel() {
    }

    public PessoaModel(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
