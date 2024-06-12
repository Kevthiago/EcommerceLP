import java.sql.*;

public class ConexaoBD {

    private static final String URL = "jdbc:sqlite:src/bancoDados/EcommerceDataBase.db"; // URL do banco
    private static final String USER = "root@localhost"; // Usuário do banco
    private static final String SENHA = "root@localhost"; // Senha do banco
    private static Connection conexao;

    public static Connection obterConexao() {
        try {
            if (conexao == null || conexao.isClosed()) {
                conexao = DriverManager.getConnection(URL, USER, SENHA);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }

    public static void fecharConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

