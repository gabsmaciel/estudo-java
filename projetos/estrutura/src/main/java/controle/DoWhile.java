package controle;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //if (... expressão verdadeira ou falsa) sentenca; OU {}
        // while (expressao verdadeira ou falso), sentenca ou {} - bloco de código.
        //for (inicializaçao da variavel; expressão; modificação da variavel (incremento etc) sentenca ou {}
        //do {} while (...) é o unico que termina com ;

        Scanner entrada = new Scanner(System.in);
        String texto = ";";

        do { System.out.println("Você precisa falar as palavras mágicas: ");
            System.out.print("Você quer sair? " );
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));
        System.out.println("Obrigado!");
        entrada.close();
    }
}
