package excecao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println(7 / entrada.nextInt());
        } catch (Exception excecao) {
            System.out.println(excecao.getMessage());
        } finally {
            entrada.close();
            System.out.println("Finalmente..");
        }
        System.out.println("Fim!");
    }
}
