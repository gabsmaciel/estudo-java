package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2500, 0.2,true);
        Produto p2 = new Produto("Teclado", 200, 0.2, true);
        Produto p3 = new Produto("Mouse", 40, 0.1, true);
        Produto p4 = new Produto("Impressora", 1200, 0.1, false);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        Consumer<String> print = System.out::print;

        Predicate<Produto> filtro = produto -> produto.preco >= 1000;
        Predicate<Produto> filtro2 = produto -> produto.desconto >= 0.2;
        Function<Produto, String> saudacao = produto -> "Parabéns a compra do " + produto.nome + " foi efetuada com sucesso!";

        produtos.stream().filter(filtro).filter(filtro2).map(saudacao).forEach(print);


    }
}
