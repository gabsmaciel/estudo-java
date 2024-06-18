package teste.heranca;

import desafio.Carro;
import desafio.Moto;
import desafio.Veiculo;
import infra.DAO;

public class NovoVeiculo {

    public static void main(String[] args) {

        DAO<Veiculo> dao = new DAO<>();

        // Incluir um Veiculo (superclasse)
        Veiculo veiculo = new Veiculo("Ford Ka", 2010);
        dao.incluirEfetivo(veiculo);

        // Incluir um Carro (subclasse)
        Carro carro = new Carro(5);
        carro.setModelo("Golf");
        carro.setAno(2020);
        dao.incluirEfetivo(carro);

        // Incluir uma Moto (outra subclasse)
        Moto moto = new Moto(true);
        moto.setModelo("Honda CB 500");
        moto.setAno(2022);
        dao.incluirEfetivo(moto);

        // Finaliza o EntityManager após as operações
        dao.fechar();
    }
}
