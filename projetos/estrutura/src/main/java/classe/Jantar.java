package classe;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 70.0);
        Comida c1 = new Comida("Feijão", 0.0223);
        Comida c2 = new Comida("Arroz", 0.300);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());

    }
}
