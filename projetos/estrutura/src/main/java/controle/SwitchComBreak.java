package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.print ("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota) { //posso associar case 10: case 9:
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
        }
        System.out.println("Conceito é " + conceito);
    }
}
