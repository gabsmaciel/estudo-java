package oo.heranca;

public class Heroi extends Jogador {
    //heroi recebe código de reuso através da herança.

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }
}
