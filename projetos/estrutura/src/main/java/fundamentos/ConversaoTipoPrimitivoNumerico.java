package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; // CONVERSÃO IMPLÍCITA
        System.out.println(a);

        float b = (float) 1.2345678; //CONVERSÃO EXPLICITA. solução padrão seria colocar F no final. (FLOAT)
        System.out.println(b);

        int c = 340;  //CONVERSÃO EXPLICITA (CAST)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1; //CONVERSÃO EXPLICITA (CAST)
        int f = (int) e;
        System.out.println(f);
    }
}
