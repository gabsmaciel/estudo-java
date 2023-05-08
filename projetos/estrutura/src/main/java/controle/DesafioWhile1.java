package controle;

import java.util.Scanner;

public class DesafioWhile1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase = "";

        while (!frase.equalsIgnoreCase("sair"))
        {System.out.println("Digite a sua frase: ");
            frase = entrada.nextLine();
        }
        entrada.close();
    }
}