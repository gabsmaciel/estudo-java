package com.example.exercicios_sb.controllers;

import com.example.exercicios_sb.models.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obtercliente() {
        return new Cliente(28, "Pedro", "123.456.789-10");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "João Augusto", "222.333.789-10");
    }
}
