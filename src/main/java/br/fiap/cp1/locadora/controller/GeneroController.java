package br.fiap.cp1.locadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GeneroController {

    @GetMapping("/genero")
    public String genero(){
        return "comédia - terror - romance";
    }
    
}