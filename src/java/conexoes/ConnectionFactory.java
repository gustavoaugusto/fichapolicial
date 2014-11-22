/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leandro
 */
public class ConnectionFactory {

    private static Connection conexao;
   private static String URL_CONEXAO = "jdbc:mysql://150.164.102.160/daw-aluno4";
    private static String USUARIO = "daw-aluno4";
    private static String SENHA = "daw04";

    /**
     * Obtém a conexão ativa.
     *
     * @return conexao.
     * @throws java.sql.SQLException
     */
    public static Connection obtemConexao() throws SQLException {
// Se não há uma conexão, então cria uma

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        if (conexao == null) {
            conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
        }
// Retorna a conexão existente
        return conexao;
    }
}
