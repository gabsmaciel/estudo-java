package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        /* Imagine que você tem dois trabalhos e eles podem ou não serem confirmados.
        Trabalho na terça (V ou F) e Trabalho na Quinta (V ou F)
        Se eu for bem no trabalho irei comprar uma televisão, ambos combinados compro uma tv de 50.
        Se eu for bem apenas em um trabalho, irei comprar tv apenas de 30. Sabe-se que de qualquer forma irei ao shopping.
        */
        boolean trabalho1 = true;
        boolean trabalho2 = false;
        boolean comprouTV50 = trabalho1 || trabalho2;
        boolean comprouTV30 = trabalho1 && trabalho2;
        boolean sorvete = true;
        boolean saudavel = true;

        //Foi bem em ambos os trabalhos.

        System.out.println("Irei comprar uma televisão de 50? " + comprouTV50);

        //Foi bem em apenas um trabalho e quis ser saudavel.

        System.out.println("Irei comprar uma televisão de 50? " + comprouTV30 + "\nTomei sorvete? " + !sorvete);

        // Não fui bem em um trabalho, comprei tv de 30 e não quis ser saudavel.

        System.out.println("Irei comprar uma televisão de 50? " + comprouTV30 + "\nTomei sorvete? " + sorvete +
                "\nSou saudavel? " + !saudavel);
    }
}
