package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        //String é uma classe, texto é o valor recebido (objeto - texto)
        String s = "texto";
        s.toUpperCase();

        //Wrappers são a versão objeto dos tipos tipos primitivos.
        //Tudo em java é OBJETO... EXCETO os tipos primitivos.
        int a = 123;
        System.out.println(a);

    }
}
