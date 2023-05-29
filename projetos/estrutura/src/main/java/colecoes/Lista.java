package colecoes;
import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        //outra forma de inserir.
        System.out.println(lista.get(3));
        System.out.println(lista.remove(1));


        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
