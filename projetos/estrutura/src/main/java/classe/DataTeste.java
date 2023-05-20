package classe;

public class DataTeste {
    public static void main(String[] args) {
        ClasseData data = new ClasseData();
        data.dia = 3;
        data.mes = 6 ;
        data.ano = 96;

        System.out.println("A data é: " + data.dia + "/" + data.mes + "/" +  data.ano + ".");
    }
}
