package excecao;

import oo.composicao.Aluno;

public class Basico {

    public static void main(String[] args) {
        try {
            Aluno a1 = null; //gerou erro nullpointer exception.
            imprimirAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário. ");

        }
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException erro) {
            System.out.println("Ocorreu um erro: " + erro.getMessage()); //imprimir a pilha de excecao.
        }
        System.out.println("Fim..");
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
