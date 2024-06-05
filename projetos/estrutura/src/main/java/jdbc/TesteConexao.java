package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306"; // Inclua a porta e o nome do banco de dados
        String usuario = "root";
        String senha = "";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão efetuada com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao estabelecer a conexão.");
        }
    }
}
