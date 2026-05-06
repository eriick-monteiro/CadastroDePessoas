package dev.bira.CadastroDePessoas.Tarefas;

import dev.bira.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_tarefeas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String dificuldade;

    // O2M - Uma Tarefa tem várias Pessoas
    @OneToMany(mappedBy = "tarefas")
    private List<PessoaModel> pessoas;
}
