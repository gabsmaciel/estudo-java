package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro salario: ");
        String salario1 = entrada.next().replace(",", ".");
        System.out.println("Digite o segundo salario: ");
        String salario2 = entrada.next().replace(",", ".");
        System.out.println("Digite o terceiro salario: ");
        String salario3 = entrada.next().replace(",", ".");
        
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);
        double media = (valor1 + valor2 + valor3) /3;
        System.out.println("A media dos salarios é " + media);
        entrada.close();
    }
}
