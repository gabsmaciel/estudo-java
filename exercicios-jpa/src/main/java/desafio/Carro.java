package desafio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name ="veiculo_id")

public class Carro extends Veiculo{

    private int capacidadeDePassageiros;

    public Carro() {

    }

    public Carro(int capacidadeDePassageiros) {
        this.capacidadeDePassageiros = capacidadeDePassageiros;
    }

    public int getCapacidadeDePassageiros() {
        return capacidadeDePassageiros;
    }

    public void setCapacidadeDePassageiros(int capacidadeDePassageiros) {
        this.capacidadeDePassageiros = capacidadeDePassageiros;
    }
}
