package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }
    Produto() {

    }
    //sem passar parametro.

    public double precoComDesconto() {
        return preco * (1- desconto);
    }
}
