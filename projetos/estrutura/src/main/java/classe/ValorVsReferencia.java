package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //atribuição de valor. cópia (tipo primitivo)

        a++;

        System.out.println(a++);

        ClasseData d1 = new ClasseData(1, 6, 2022);
        ClasseData d2 = d1; //atribuição por referência. (objeto)

        d1.dia = 31;
        d2.mes = 12;
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
    }
    static void voltarDataParaValorPadrao(ClasseData d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
}
