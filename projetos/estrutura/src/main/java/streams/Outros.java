package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);
        Aluno aluno5 = new Aluno("Ana", 7.1);
        Aluno aluno6 = new Aluno("Pedro", 6.1);
        Aluno aluno7 = new Aluno("Gui", 8.1);
        Aluno aluno8 = new Aluno("Maria", 10);

        List<Aluno> alunos =
                Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8);

        System.out.println("Distinguir...uso do distinct...\n");

        alunos.stream().distinct().forEach(System.out::println); //apos uso de equals e hashcode.

        System.out.println("\nSkip/Limit");

        alunos.stream().distinct().skip(2).
                limit(1).forEach(System.out::println); //uso de Skip e Limit

        System.out.println("\nTake/While");

        alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);
    }
}
