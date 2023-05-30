package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Princípe"); //retorna verdadeiro ou falso.
        livros.push("Don Quixote"); //tem exceção
        livros.push("O Hobbit");

        System.out.println(livros.peek()); //ultimo a entrar é o primeiro sair. - Hobbit no caso.
        System.out.println(livros.poll()); //remove também o Hobbit.
        System.out.println(livros.pop()); //outra forma de remover.

        //livros.size();
        //livros.clear();
        //livros.contains();
    }
}
