package excecao;

public class StringVaziaException extends Throwable {
    private final String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo $s está vazio", nomeDoAtributo);
    }
}

