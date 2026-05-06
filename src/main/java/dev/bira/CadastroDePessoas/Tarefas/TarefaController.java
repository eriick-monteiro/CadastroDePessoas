package dev.bira.CadastroDePessoas.Tarefas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TarefaController {
    @GetMapping("")
    public String home() {
        return "Home de Tarefas";
    }
}
