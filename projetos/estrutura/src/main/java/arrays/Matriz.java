package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Matriz {
    public static void main(String args[] ) {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite os números separados: ");
        String entradaUsuario = entrada.nextLine();

        String [] numeros = entradaUsuario.split(",");
        int [] vetor = Arrays.stream(numeros).
       mapToInt(Integer::parseInt)
                .toArray();
        //utilização de lambdas

        int nRepetidos = contaNumerosRepetidos(vetor);
        System.out.println ("Quantidade de números repetidos: " + nRepetidos);
    }
    public static int contaNumerosRepetidos(int[] vetor) {
        int contador = 0;
        HashSet<Integer> numerosRepetidos = new HashSet<>();
        for (int i =0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor [i] == vetor [j]&& !numerosRepetidos.contains(vetor[i])) {
                    contador++;
                    numerosRepetidos.add(vetor [i]);
                    break;
                }
            }
        }
        return contador;
    }
}