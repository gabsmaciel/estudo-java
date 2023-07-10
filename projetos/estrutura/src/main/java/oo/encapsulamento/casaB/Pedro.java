package oo.encapsulamento.casaB;
import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {

        // Ana mae = new Ana();
        // System.out.println(mae.facoDentroDeCasa);
        //// ->>>> o acesso facoDentroDeCasa é visivel apenas para mesmmo pacote.

        // System.out.println(mae.formaDeFalar);
        //// ->>>> a forma de falar é protected e transmitido por herança.
        // porque está sendo acessado por instancia e não herdado. se eu retiro mae, será herdado e não instaciado.

        //System.out.println(mae.todosSabem);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
