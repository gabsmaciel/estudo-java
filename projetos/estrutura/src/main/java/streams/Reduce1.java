package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;

        int total1 = numeros.stream().reduce(soma).get();
        System.out.println(total1);

        Integer total2 = numeros.parallelStream().reduce(0, soma);
        System.out.println(total2);

    }
}
