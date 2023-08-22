package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {


        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "root";
        String senha = "1234";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");

        conexao.close();

    }
}
