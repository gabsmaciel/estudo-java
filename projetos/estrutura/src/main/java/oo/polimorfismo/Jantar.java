package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);
        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);
        Comida ingrediente3 = new Arroz(0.3);

        //Comida ingrediente3 = new Comida(0.3); -> após colcoar a classe abstrata ela não pdoe mais ser instanciada aqui.

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);

        System.out.println("Após ingrediente 3 = " + convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.44);
        convidado.comer(sobremesa);

        System.out.println("Após sobremesa: " + convidado.getPeso());

    }
}
