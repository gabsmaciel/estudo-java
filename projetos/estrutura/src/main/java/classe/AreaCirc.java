package classe;

public class AreaCirc {
    double raio;
    static final double PI = 3.14;

    AreaCirc(double radioInicial) {
        raio = radioInicial;
    }
    double area() {
        return PI * Math.pow(raio, 2);
    }
    static double area(double raio) {
        return PI * Math.pow(raio,2);
    }
}
