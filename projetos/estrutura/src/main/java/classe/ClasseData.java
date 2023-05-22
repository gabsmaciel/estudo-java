package classe;

public class ClasseData {
    int dia;
    int mes;
    int ano;

    ClasseData() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    ClasseData(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}