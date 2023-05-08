package controle;

public class For1 {
    public static void main(String[] args) {
        /* estrutura planejada para número de repetição.
         */
        for (int contador = 0; contador <= 20; contador++) {
            System.out.printf("i = %d\n", contador);
        }
        /* estrutura DETERMINADA de repetição.
         */
        int x = 2;
        for (; x < 10; ) {
            System.out.println("x = " + x);
            x++;
        }
        //criando um laço/loop infinito
        //     for (;;) {
        //           System.out.println("Fim");

    }
}
