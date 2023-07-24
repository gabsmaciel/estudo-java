package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Comparator<Aluno> melhorNota = (a1, a2) -> { //aluno 1 e aluno 2.
            if (a1.nota > a2.nota) return 1;
            if (a1.nota < a2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get()); ///MAIOR NOTA USO DE MAX.

        System.out.println(alunos.stream().min(melhorNota).get()); //MENOR NOTA USO DE MIN.



    }
}
