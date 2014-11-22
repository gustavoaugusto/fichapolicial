package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastra_002dfichapolicial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Ficha Policial</title>\r\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">Ficha Policial</a> \r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"navbar-text\">Acesse os últimos registros de delitos</p>\r\n");
      out.write("\r\n");
      out.write("            </nav>   \r\n");
      out.write("            <!-- /. NAV TOP  -->\r\n");
      out.write("            <nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("                <div class=\"sidebar-collapse\">\r\n");
      out.write("                    <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("                        <li class=\"text-center\">\r\n");
      out.write("                            <img src=\"assets/img/find_user.png\" class=\"user-image img-responsive\"/>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"active-menu\" href=\"cadastra-fichapolicial.jsp\"><span class=\"glyphicon glyphicon-plus\"></span> Cria ocorrência </a>\r\n");
      out.write("                        </li>             \t\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>  \r\n");
      out.write("            <!-- /. NAV SIDE  -->\r\n");
      out.write("            <div id=\"page-wrapper\" >\r\n");
      out.write("                <div id=\"page-inner\">\r\n");
      out.write("                    <div class=\"page-header\">\r\n");
      out.write("                        <h1>Registrar Delito </h1>\r\n");
      out.write("                    </div>         \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-6 \">\r\n");
      out.write("                            <form role=\"form\" action=\"Controlador\">\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"hidden\" name=\"logica\" value=\"AdicionaDelito\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"nome\">Nome</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"nome\" name=\"nome\" placeholder=\"Nome do meliante\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"cpf\">CPF</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"cpf\" name=\"cpf\" placeholder=\"CPF do meliante\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"residencia\">Residencia:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"residencia\" name=\"residencia\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"tipodedelito\">Tipo de Delito</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"tipodedelito\" name=\"tipodedelito\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"data\">Data:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"data\" name=\"data\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"hora\">Hora:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"hora\" name=\"hora\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"localDoCrime\">Local do Crime:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"localDoCrime\" name=\"localDoCrime\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">Salvar</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /. PAGE INNER  -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /. PAGE WRAPPER  -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /. WRAPPER  -->\r\n");
      out.write("        <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\r\n");
      out.write("        <!-- JQUERY SCRIPTS -->\r\n");
      out.write("        <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <!-- BOOTSTRAP SCRIPTS -->\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- METISMENU SCRIPTS -->\r\n");
      out.write("        <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("        <!-- CUSTOM SCRIPTS -->\r\n");
      out.write("        <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
