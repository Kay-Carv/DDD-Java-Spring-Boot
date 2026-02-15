package br.com.fiap2espa.aula01.controller;


import br.com.fiap2espa.aula01.amigo.Amigo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amigos")
public class AmigosController {

    @PostMapping    //Método Post
    public void criarAmigo(@RequestBody Amigo amigo) {   //Captura um objeto e traz para uma string chamada dados
        System.out.println(amigo);
    }
}