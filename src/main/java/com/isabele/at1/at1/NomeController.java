package com.isabele.at1.at1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomeController {

    @GetMapping("/meu-nome")
    public String meuNome() {
        return "Isabele Leticia Queiroz"; 
    }
}
