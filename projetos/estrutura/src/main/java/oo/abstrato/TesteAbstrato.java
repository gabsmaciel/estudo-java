package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        Mamifero a = new Cachorro(); //Se uso Animal não consigo usar mamar, então é necessario uso do Mamifero.
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());

    }
}
