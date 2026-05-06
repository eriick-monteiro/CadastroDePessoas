package dev.bira.CadastroDePessoas.Tarefas;

import dev.bira.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_tarefeas")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String dificuldade;

    // O2M - Uma Tarefa tem várias Pessoas
    @OneToMany(mappedBy = "tarefas")
    private List<PessoaModel> pessoas;

    public TarefaModel() {
    }

    public TarefaModel(Long id, String titulo, String dificuldade) {
        this.id = id;
        this.titulo = titulo;
        this.dificuldade = dificuldade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
