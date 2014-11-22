/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import componentes.Delito;
import conexoes.DelitoDAO;
import java.sql.Date;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo
 */
public class AdicionaDelito implements Logica {

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse res) throws ServletException {

        try {
            Delito delito = new Delito();

            delito.setNome(request.getParameter("nome"));
            delito.setCpf(request.getParameter("cpf"));
            delito.setResidencia(request.getParameter("residencia"));
            delito.setTipoDeDelito(request.getParameter("tipodedelito"));

            Date datas = Date.valueOf(request.getParameter("data"));
            delito.setData(datas);

            delito.setHora(request.getParameter("hora"));
            delito.setLocalDoCrime(request.getParameter("localDoCrime"));
            delito.setEstado(request.getParameter("estado"));

            DelitoDAO daoDoDelito = new DelitoDAO();

            daoDoDelito.adiciona(delito);
            // Redireciona para a página de listagem básica
            return "controlador?logica=ListaContatosLogic";
        } catch (SQLException ex) {
            throw new ServletException();
        }
    }

}
