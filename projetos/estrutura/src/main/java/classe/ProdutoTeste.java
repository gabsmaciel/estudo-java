package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        //criacao de objeto de forma consciente.
        Produto p1 = new Produto("Notebook");
        p1.preco = 4356.89;
        //p1.nome = "Notebook";
        //p1.desconto = 0.25;
        System.out.println(p1.nome);
        System.out.println(p1.precoComDesconto());

        // var infere o tipo.
        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        //p2.desconto = 0.29;
        System.out.println(p2.nome);
        System.out.println(p2.precoComDesconto());
        //no presente código apresentamos formas de instancias através da classe Produto.
    }
}
