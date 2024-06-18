package desafio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name ="veiculo_id")

public class Moto extends Veiculo {

    private boolean temCarona;
    public Moto() {
    }

    public Moto(boolean temCarona) {
        this.temCarona = temCarona;
    }

    public boolean isTemCarona() {
        return temCarona;
    }

    public void setTemCarona(boolean temCarona) {
        this.temCarona = temCarona;
    }
}
