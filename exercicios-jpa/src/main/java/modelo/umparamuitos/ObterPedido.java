package modelo.umparamuitos;

import infra.DAO;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }
        dao.fechar();
    }
}
