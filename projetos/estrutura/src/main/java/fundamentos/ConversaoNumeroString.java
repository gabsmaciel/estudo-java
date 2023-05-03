package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        //PRIMEIRA FORMA

        Integer num1 = 10000;
        System.out.println(num1.toString().length()); //Converte para String -> para saber valor.

        //SEGUNDA FORMA

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num1).length());


    }
}
