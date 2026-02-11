package br.com.fiap2espa.aula01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController             //Esse método é orbigatório para o frame
@RequestMapping("/aula01")  //Criaremos uma rota para o Spring Boot entrar nesse método

public class HealthCheckController {
    @GetMapping("/health-check")             //Encontrar na dentro da pasta
    public String healthcheck(){
        return "Verificação de Integridade Aula 01";
    }
}
