package dev.bira.CadastroDePessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("")
    public String home() {
        return "Hello, World!";
    }

    @GetMapping("/bem-vindo")
    public String bemVindo() {
        return "Bem vindo!";
    }
}