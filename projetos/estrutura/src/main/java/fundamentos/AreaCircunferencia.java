package fundamentos;
public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;
        //final não pode ser mudado, não pode dar um novo valor.
        //exemplo não posso declarar novamente pi.
        double area = PI* raio * raio;
        System.out.println("Área = "+ area);

    }
}
