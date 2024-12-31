package com.example.exercicios_sb.controllers;

import com.example.exercicios_sb.models.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


    @GetMapping("/somar/{a}/{b}")
    public double somar(@PathVariable double a, @PathVariable double b) {
        Calculadora calculadora = new Calculadora();
        return calculadora.somar(a, b);
    }


    @GetMapping("/subtrair")
    public double subtrair(@RequestParam double a, @RequestParam double b) {
        Calculadora calculadora = new Calculadora();
        return calculadora.subtrair(a, b);
    }
}
