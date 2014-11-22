package mvc;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Logica;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controlador")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {

        try {

            // Cria uma classe geral
            String nomeDaClasse = "logica." + request.getParameter("logica");
            Class classe = Class.forName(nomeDaClasse);

            Logica logica = (Logica) classe.newInstance();

            // Recebe o String após a execução da lógica
            String pagina = logica.executa(request, response);
            // Faz o forward para a página JSP
            request.getRequestDispatcher(pagina).forward(request, response);

        } catch (Exception ex) {
            Logger.getLogger(ControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
