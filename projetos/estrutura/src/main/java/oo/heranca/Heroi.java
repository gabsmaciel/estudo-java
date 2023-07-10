package oo.heranca;

public class Heroi extends Jogador {
    //heroi recebe código de reuso através da herança.

    Heroi(int x, int y) {
        super(x, y);
    }

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }
}
