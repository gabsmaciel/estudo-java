package fundamentos.operadores;
import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2"=="2");
        String s1 = new String("2");
        System.out.println("2"== s1);
        System.out.println("2".equals((s1))); //uso do equals.

        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.next();
        System.out.println("2"==s2.trim()); //retorna falso.
        //O ideal ao comparar string é usar o equals como abaixo.
        //o uso do trim para remover espaços, porque talvez usuario pode usar espaços ao digitar.

        System.out.println("2".equals(s2.trim())); //retornou verdadeiro tendo em vista uso do equals e uso do trim para remover os espaços.

        // na COMPARAÇÃO de STRINGS usa-se o equals e não ==.
        entrada.close();
    }
}
