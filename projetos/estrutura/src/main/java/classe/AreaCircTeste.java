package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        System.out.println(a1.area());
        System.out.println(AreaCirc.PI);
        //area da instância.
        System.out.println(AreaCirc.area(100));

        /* a1.pi = 10;
        //System.out.println(a1.area());
        /*AreaCirc a2 = new AreaCirc(5);
        //a2.pi = 5;
        //System.out.println(a2.area());
        //exemplos com uso de pi sem ser estatico.
         */
    }
}
