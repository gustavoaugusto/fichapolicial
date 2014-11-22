package logica;

import componentes.Delito;
import conexoes.DelitoDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaContatosLogic implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        List<Delito> delitos;
        // Monta a lista de contatos
        if ("foragidos".equals(req.getParameter("restricao"))) { // Lista de Foragidos e redireciona para página de foragidos
            delitos = new DelitoDAO().getForagidos();
            req.setAttribute("delitos", delitos);
            return "lista-foragidos.jsp";

        } else if("atualiza".equals(req.getParameter("restricao")))  { // Lista Geral e envia para página de atualização
            delitos = new DelitoDAO().getListaOrderByName();
            req.setAttribute("delitos", delitos);
            return "atualiza-fichas.jsp";
            
        } else { // Lista Geras e redireciona para página de listagem Geral
            delitos = new DelitoDAO().getListaGroupByTipoOrderName();
            req.setAttribute("delitos", delitos);
            return "lista-fichaspoliciais.jsp";
        }

        // Guarda a lista no request
    }

}
