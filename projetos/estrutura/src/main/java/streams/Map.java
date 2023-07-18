package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    //metodo dentro da stream

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print); //foreach função terminal
        //streem de marcas que todas saem maisculas.

        UnaryOperator<String> maiscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
       // UnaryOperator<String> grito = n -> n.charAt(0) + "!!!!";

        ///criacao de lambdas com uso de Unary Operator.
        System.out.println("\n\nUsando composição....");

        marcas.stream().
                map(maiscula).map(primeiraLetra).map(Utilitarios::grito).forEach(print);

        ///instaciado Utilitarios para fazer o grito e retirar o UnaryOperator. Da para fazer das duas formas.

    }
}
