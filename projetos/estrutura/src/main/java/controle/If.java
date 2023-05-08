package controle;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) { //observação:a nota não pode ser maior que 10 e nem menor que 7 (condição).
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }
        if (media < 7 && media >= 4.5) {
            System.out.println("Recuperação");
        }
        entrada.close();
    }
}
