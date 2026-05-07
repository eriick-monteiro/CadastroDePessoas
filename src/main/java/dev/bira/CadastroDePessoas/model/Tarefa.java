package dev.bira.CadastroDePessoas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_tarefa")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String dificuldade;

    // O2M - Uma Tarefa tem várias Pessoas
    @OneToMany(mappedBy = "tarefa")
    @JsonIgnore
    private List<Pessoa> pessoa;
}
