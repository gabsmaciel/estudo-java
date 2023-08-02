package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            gerarErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :) ");
    }

    static void gerarErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01! "); //exececao não checada ou verificada -> RUNTIME.
    }

    static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #02! "); ///na assinatura do metodo lança exececao
    }
}