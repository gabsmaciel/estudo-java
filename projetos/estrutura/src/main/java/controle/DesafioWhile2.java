package controle;

import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota: ");
            nota = entrada.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total += nota;
                numeroDeNotas++;
            }
        }
        double media = total / numeroDeNotas;
        System.out.println("Média = " + media);
        entrada.close();
    }
}
