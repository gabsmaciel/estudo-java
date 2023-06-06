package oo.desafio;


public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Zé das Couves");
        Compra compra1 = new Compra();
        compra1.adicionarProduto("Caneta", 1, 100);

        cliente.compras.add(compra1);

        System.out.println(cliente.obterValorTotal());

    }
}
