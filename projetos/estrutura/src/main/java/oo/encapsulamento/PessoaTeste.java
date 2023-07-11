package oo.encapsulamento;

import java.io.InvalidClassException;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 34);
        p1.setIdade(30);
        // p1.idade = -30; //alterar valor da variavel - estava public
        // System.out.println(p1.idade);  ///le o valor da variavel.
        System.out.println(p1); //toString
    }
}
