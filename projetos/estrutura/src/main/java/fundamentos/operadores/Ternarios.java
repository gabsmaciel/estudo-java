package fundamentos.operadores;

public class Ternarios {
    public static void main(String[] args) {
        double media = 7.6;
        //atribuição condicional, operador ternario com dois simbolos. 3 operandos.
        String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
        System.out.println("O aluno está " + resultado);
    }
}
