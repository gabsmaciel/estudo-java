package com.example.exercicios_sb.controllers;

import com.example.exercicios_sb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obtercliente() {
        return new Cliente(28, "Pedro", "123.456.789-10");
    }
}
