package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> adicionam elementos na fila.
        //Diferença é o comportamento quando a fila está cheia.

        fila.add("Ana");
        fila.offer("Bia"); //retorna verdadeiro ou falso.
        fila.add("Carlos");
        fila.offer("Bia");
        fila.add("Daniel");

        System.out.println(fila.peek()); //retorna falso se a fila estiver vazia.
        System.out.println(fila.element()); //retorna uma exceção se estiver vazia.

        System.out.println(fila.poll()); //remove da lista.
        System.out.println(fila.remove()); //remove da lista mas quando remover todos os elementos lança execeção
        //ao contrario do poll que fica null.


    }
}
