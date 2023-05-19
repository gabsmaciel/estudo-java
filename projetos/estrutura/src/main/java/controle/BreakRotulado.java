package controle;

public class BreakRotulado {
    public static void main(String[] args) {
        //esse break não é boa utilização.

        externo:
        for (int i = 0; i < 3; i++) {
            interno:
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break;
                }
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}
