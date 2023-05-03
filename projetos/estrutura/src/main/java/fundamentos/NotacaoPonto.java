package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replace("X","Senhora");
        s =  s.concat("!!!!");
        System.out.println(s);

        String x = "Bom dia X"
                .replace("X","Senhor")
                .toUpperCase()
                .concat("!!!!!");
        System.out.println ("y");

        //Tipos primitivos NÃO tem operador "."
        /* exemplo: int a = 3
       o "a" não da para atribuir.
         */
    }
}
