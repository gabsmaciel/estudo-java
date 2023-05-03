package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");
        /*o println diferente do ln se você usa duas vezes ele irá quebrar a linha, diferente do print normal
        que não terá quebra, percebe-se que o o dia vai para linha de baixo. O dia foi usado a quebra obrigatória \n */
        System.out.println("Bom");
        System.out.println("dia!");
        System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Qual sua idade? ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("\n\nNome = " + nome + " " + sobrenome + " minha idade é = " + idade);
        entrada.close();
    }
}