package com.example.exercicios_sb.models;

public class Calculadora {

    public Calculadora(Calculadora somar) {
    }

    public Calculadora() {

    }

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

}
