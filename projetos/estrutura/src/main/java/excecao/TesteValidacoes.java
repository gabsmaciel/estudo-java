package excecao;

public class TesteValidacoes {

    public static void main(String[] args) throws StringVaziaException {

        try {
            Aluno aluno = new Aluno("", -7, true);

            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println("Fim");
    }
}
