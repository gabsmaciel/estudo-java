package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 2500, 0.2, true);
        Produto produto2 = new Produto("CPU", 200, 0.2, true);
        Produto produto3 = new Produto("Monitor", 800, 0.3, true);
        Produto produto4 = new Produto("Impressora", 400, 0.3, false);


        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4);

        Consumer<String> print = System.out::print;

        Predicate<Produto> filtroDeFrete = produto -> produto.freteGratis = true;
        Predicate<Produto> filtroDeDesconto = produto -> produto.desconto >= 0.3;
        Function<Produto, String> saudacao = produto -> "Parabéns a compra do " + produto.nome + " foi efetuada com sucesso!";
        Function<Produto, String> saudacaoSuperPromocao = produto -> "Parabéns a compra do " + produto.nome +
                " foi efetuada com sucesso e com Frete Grátis com a SUPER PROMOÇÃO!";


        System.out.println("Uso de Filter apenas com Filtro de Desconto: ");
        produtos.stream().filter(filtroDeDesconto).map(saudacao).forEach(print);

        System.out.println("\n\nUso de Filter apenas com Filtro de Desconto e Frete Grátis: ");

        produtos.stream().filter(filtroDeFrete).filter(filtroDeDesconto).map(saudacao).forEach(print);
    }
}
