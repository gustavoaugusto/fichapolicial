package logica;

import conexoes.DelitoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo
 */
public class RemoveDelito implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) {

        try {
            DelitoDAO daoDoDelito = new DelitoDAO();
            // Remove no banco o Delito de acordo com ID
            daoDoDelito.remove(Integer.parseInt(req.getParameter("id")));
            
            
            return "controlador?logica=ListaContatosRemoveLogic";
        } catch (SQLException ex) {
            Logger.getLogger(RemoveDelito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

}
