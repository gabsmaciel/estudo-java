package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); //int -> Integer
        conjunto.add('x');

        System.out.println("O tamanho é: " + conjunto.size());
        conjunto.add("teste");
        //aceitou repetição porque o teste está minusculo caso contrario não aceitaria.
        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println("O tamanho é: " + conjunto.size());

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);


        //conjunto.addAll((nums));  //união entre dois conjuntos.
        conjunto.retainAll(nums); // somente o que está retido, o que tem em comum entre ambos.
        System.out.println(conjunto);

        conjunto.clear(); //limpar
        System.out.println(conjunto);

    }
}
