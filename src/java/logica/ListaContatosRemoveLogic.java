package logica;

import componentes.Delito;
import conexoes.DelitoDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaContatosRemoveLogic implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // Monta a lista de contatos
        List<Delito> delitos = new DelitoDAO().getListaOrderByName();

        // Guarda a lista no request
        req.setAttribute("delitos", delitos);

        return "remove-fichapolicial.jsp";
    }

   
}
