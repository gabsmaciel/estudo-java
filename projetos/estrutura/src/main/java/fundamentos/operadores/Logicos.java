package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        //&& (E lógico ou AND): Retorna verdadeiro se ambas as expressões que estão sendo comparadas forem verdadeiras.
        System.out.println(condicao1 && condicao2);
        // || (OU lógico ou OR): Retorna verdadeiro se pelo menos uma das expressões que estão sendo comparadas for verdadeira.
        System.out.println(condicao1 || condicao2);
        // EXCLUSIVO
        System.out.println(condicao1 ^ condicao2);
        /* (NÃO lógico ou NOT): Inverte o valor da expressão, ou seja, se a expressão for verdadeira, retorna falso e
        se for falsa, retorna verdadeiro.
              */
        System.out.println(!condicao1);
        System.out.println(!condicao2);

    }
}
