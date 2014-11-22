/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import componentes.Delito;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DelitoDAO {

    // a conexão com o banco de dados
    private Connection con;

    public DelitoDAO() throws SQLException {

        this.con = ConnectionFactory.obtemConexao();

    }

    public void adiciona(Delito delito) throws SQLException {
        String sql = "insert into fichapolicial (nome, cpf, residencia, tipoDeDelito, data, hora, LocalDoCrime, estado) values(?,?,?,?,?,?,?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);
            // seta os valores
            stmt.setString(1, delito.getNome());
            stmt.setString(2, delito.getCpf());
            stmt.setString(3, delito.getResidencia());
            stmt.setString(4, delito.getTipoDeDelito());
            stmt.setDate(5, delito.getData());
            stmt.setString(6, delito.getHora());
            stmt.setString(7, delito.getLocalDoCrime());
            stmt.setString(8, delito.getEstado());

            // executa
            stmt.execute();
            stmt.close();

        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "O banco não possui esse delito");
        } catch (SQLException ex) {
            Logger.getLogger(DelitoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Delito> getLista() throws SQLException {

        PreparedStatement stmt = this.con.prepareStatement("select * from fichapolicial");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Delito> fichapolicial = new ArrayList<Delito>();

        while (rs.next()) {
            // criando o objeto Delito
            Delito delito = new Delito();
            delito.setId(rs.getInt("id"));
            delito.setNome(rs.getString("nome"));
            delito.setCpf(rs.getString("cpf"));
            delito.setResidencia(rs.getString("residencia"));
            delito.setTipoDeDelito(rs.getString("tipoDeDelito"));
            delito.setData(rs.getDate("data"));
            delito.setHora(rs.getString("hora"));
            delito.setLocalDoCrime(rs.getString("localDoCrime"));
            delito.setEstado(rs.getString("estado"));

            // adicionando o objeto à lista
            fichapolicial.add(delito);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }

    public ArrayList<Delito> getListaOrderByName() throws SQLException {

        PreparedStatement stmt = this.con.prepareStatement("select * from fichapolicial ORDER BY nome");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Delito> fichapolicial = new ArrayList<Delito>();

        while (rs.next()) {
            // criando o objeto Delito
            Delito delito = new Delito();
            delito.setId(rs.getInt("id"));
            delito.setNome(rs.getString("nome"));
            delito.setCpf(rs.getString("cpf"));
            delito.setResidencia(rs.getString("residencia"));
            delito.setTipoDeDelito(rs.getString("tipoDeDelito"));
            delito.setData(rs.getDate("data"));
            delito.setHora(rs.getString("hora"));
            delito.setLocalDoCrime(rs.getString("localDoCrime"));
            delito.setEstado(rs.getString("estado"));

            // adicionando o objeto à lista
            fichapolicial.add(delito);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }
    
     public ArrayList<Delito> getForagidos() throws SQLException {

        PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM `fichapolicial` WHERE estado = 'Foragido'");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Delito> fichapolicial = new ArrayList<Delito>();

        while (rs.next()) {
            // criando o objeto Delito
            Delito delito = new Delito();
            delito.setId(rs.getInt("id"));
            delito.setNome(rs.getString("nome"));
            delito.setCpf(rs.getString("cpf"));
            delito.setResidencia(rs.getString("residencia"));
            delito.setTipoDeDelito(rs.getString("tipoDeDelito"));
            delito.setData(rs.getDate("data"));
            delito.setHora(rs.getString("hora"));
            delito.setLocalDoCrime(rs.getString("localDoCrime"));
            delito.setEstado(rs.getString("estado"));

            // adicionando o objeto à lista
            fichapolicial.add(delito);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }

    public ArrayList<Delito> getListaGroupByTipoOrderName() throws SQLException {

        PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM `fichapolicial` ORDER BY `tipoDeDelito` ASC, `nome` ASC");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Delito> fichapolicial = new ArrayList<Delito>();

        while (rs.next()) {
            // criando o objeto Delito
            Delito delito = new Delito();
            delito.setId(rs.getInt("id"));
            delito.setNome(rs.getString("nome"));
            delito.setCpf(rs.getString("cpf"));
            delito.setResidencia(rs.getString("residencia"));
            delito.setTipoDeDelito(rs.getString("tipoDeDelito"));
            delito.setData(rs.getDate("data"));
            delito.setHora(rs.getString("hora"));
            delito.setLocalDoCrime(rs.getString("localDoCrime"));
            delito.setEstado(rs.getString("estado"));

            // adicionando o objeto à lista
            fichapolicial.add(delito);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }

    public void remove(int idDoDelito) {

        String sql = "DELETE FROM fichapolicial WHERE id = " + idDoDelito;

        try {
            // prepared statement para deletar
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualiza(Delito delito) {

        String query = "UPDATE fichapolicial set nome = ?, cpf = ?, residencia = ?, tipoDeDelito = ?, data = ?, hora = ?, localDoCrime = ?, estado = ? WHERE id = ?";
        try {
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, delito.getNome());
            preparedStmt.setString(2, delito.getCpf());
            preparedStmt.setString(3, delito.getResidencia());
            preparedStmt.setString(4, delito.getTipoDeDelito());
            preparedStmt.setDate(5, delito.getData());
            preparedStmt.setString(6, delito.getHora());
            preparedStmt.setString(7, delito.getLocalDoCrime());
            preparedStmt.setString(8, delito.getEstado());

            preparedStmt.setInt(9, delito.getId());

            preparedStmt.execute();
            preparedStmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(DelitoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Delito> localizaDelitonome(String nome) throws SQLException {

        PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM fichapolicial WHERE nome = '" + nome + "'");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Delito> fichapolicial = new ArrayList<>();

        while (rs.next()) {
            // criando o objeto Delito
            Delito delito = new Delito();
            delito.setId(rs.getInt("id"));
            delito.setNome(rs.getString("nome"));
            delito.setCpf(rs.getString("cpf"));
            delito.setResidencia(rs.getString("residencia"));
            delito.setTipoDeDelito(rs.getString("tipoDeDelito"));
            delito.setData(rs.getDate("data"));
            delito.setHora(rs.getString("hora"));
            delito.setTipoDeDelito(rs.getString("localDoCrime"));

            // adicionando o objeto à lista
            fichapolicial.add(delito);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }

    public Delito getDelitoByID(int IDrequisitado) throws SQLException {

        PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM fichapolicial WHERE id = " + IDrequisitado);
        ResultSet rs = stmt.executeQuery();

        Delito delito = null;
        while (rs.next()) {
            // criando o objeto Delito
            delito = new Delito();
            delito.setId(rs.getInt("id"));
            delito.setNome(rs.getString("nome"));
            delito.setCpf(rs.getString("cpf"));
            delito.setResidencia(rs.getString("residencia"));
            delito.setTipoDeDelito(rs.getString("tipoDeDelito"));
            delito.setData(rs.getDate("data"));
            delito.setHora(rs.getString("hora"));
            delito.setLocalDoCrime(rs.getString("localDoCrime"));
            delito.setEstado(rs.getString("estado"));

        }

        rs.close();
        stmt.close();
        return delito;
    }

    public ArrayList<Delito> localizaContatocpf(Long cpf) throws SQLException {

        PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM fichapolicial WHERE cpf = '" + cpf + "'");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Delito> fichapolicial = new ArrayList<>();

        while (rs.next()) {
            // criando o objeto Delito
            Delito delito = new Delito();
            delito.setId(rs.getInt("id"));
            delito.setNome(rs.getString("nome"));
            delito.setCpf(rs.getString("cpf"));
            delito.setResidencia(rs.getString("residencia"));
            delito.setTipoDeDelito(rs.getString("tipoDeDelito"));
            delito.setData(rs.getDate("data"));
            delito.setHora(rs.getString("hora"));
            delito.setLocalDoCrime(rs.getString("localDoCrime"));

            fichapolicial.add(delito);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }
}
