package colecoes;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        // a lista será de String. o uso do diamond é lidar com uso do mesmo tipo.
       // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>(); //TreeSet -> ordem que foi inserido.
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        //não é possível acessar pelo indice
        for (String candidato:listaAprovados) {
            System.out.println(candidato);
        }
    }
}
