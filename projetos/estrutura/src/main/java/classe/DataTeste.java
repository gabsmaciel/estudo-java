package classe;

public class DataTeste {
    public static void main(String[] args) {

        //primeiro construtor.

        ClasseData d1 = new ClasseData();

        System.out.println(d1.obterDataFormatada());

        //segundo construtor.

        ClasseData d2 = new ClasseData(30,12,1970);

        System.out.println(d2.obterDataFormatada());

        //terceiro construtor.

        ClasseData data = new ClasseData();
        data.dia = 3;
        data.mes = 6;
        data.ano = 96;

        System.out.println("A data é: " + data.dia + "/" + data.mes + "/" + data.ano + ".");
        //modelo acima feito por mim.
        System.out.println(data.obterDataFormatada());
        //modelo acima feito com formatação de String na classe de data.

    }
}
