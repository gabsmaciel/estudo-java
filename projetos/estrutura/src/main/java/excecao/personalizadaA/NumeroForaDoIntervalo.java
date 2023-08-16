package excecao.personalizadaA;

@SuppressWarnings("serial")
class numeroForaDoIntervalo extends RuntimeException {

    private String nomeDoAtributo;

    public numeroForaDoIntervalo(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora. ");
    }
}
