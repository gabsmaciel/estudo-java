package fundamentos;
public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);
        var b = 4.5;
        System.out.println(b);
        var c = "Texto";
        System.out.println(c);

        /* inferencia -> o java infere que pelo valor define.
        como dado no exemplo, o java declarou que é uma string sem a necessidade da declaração.
        o que não pode acontecer -> declarar uma variavel que já está determinada de um tipo e recebe outro valor.
        exemplo a variavel c não pode ser declarada de forma numerica, pois já é string.
         */
    }
}
