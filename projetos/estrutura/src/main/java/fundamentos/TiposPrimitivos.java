package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações de um funcionário.
        //Tipos numéricos inteiros.
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontoAcumulados = 3_134_845_233L;

        //Tipos numéricos reais.
        // F no final -> literal float.
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeferias = false; //true

        //Tipo caractere
        char status = 'A'; //ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa*365);

        //Numeros de viagens
        System.out.println(numeroDeVoos/2);

        //Pontos por real
        System.out.println(pontoAcumulados/vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeferias);
        System.out.println("Status: " + status);
    }
}
