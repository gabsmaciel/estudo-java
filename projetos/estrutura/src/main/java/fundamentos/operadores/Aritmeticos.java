package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 5);

        var x = 34.56;
        double y = 2.2;
        System.out.println(x + y);

        int a = 8;
        int b = 3;
        System.out.println(8 - 3);

        //operando com casting em uma operação de inteiros para um double.
        System.out.println(a/(double) b);
    }
}
