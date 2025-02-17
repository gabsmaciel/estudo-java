package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto: produtos) {
            System.out.println("ID: " + produto.getId() + " , Nome: " + produto.getNome());
        }

        double precoTotal = produtos.stream().map(produto -> produto.getPreco())
                .reduce(0.0,(total, p) -> total + p).doubleValue();
        System.out.println("O valor total é R$" + precoTotal);

        dao.fechar();
    }
}
