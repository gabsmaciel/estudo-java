package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

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
