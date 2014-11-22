<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Ficha Policial</title>
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <link href="assets/css/custom.css" rel="stylesheet" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    </head>
    <body>
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">Ficha Policial</a> 
                </div>
                <p class="navbar-text">Acesse os últimos registros de delitos</p>

            </nav>   
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="anonimo.jpg" class="img-responsive img-rounded">
                        </li>
                        <li>
                            <a href="index.jsp"><span class="glyphicon glyphicon-home"></span> HOME</a>
                        </li>
                        <li>
                            <a href="cadastra-fichapolicial.jsp"> <span class="glyphicon glyphicon-plus"></span> Criar Ocorrência</a>
                        </li>	
                        <li>
                            <a  href="controlador?logica=ListaContatosRemoveLogic"> <span class="glyphicon glyphicon-minus"></span> Remove Delitos</a>
                        </li>
                        <li>
                            <a class="active-menu" href="controlador?logica=ListaContatosLogic&restricao=atualiza"> <span class="glyphicon glyphicon-pencil"></span> Atualiza Delitos</a>
                        </li>
                        <li>
                            <a  href="controlador?logica=ListaContatosLogic"> <span class="glyphicon glyphicon-th-list"></span> Lista Delitos</a>
                        </li>
                        <li>
                            <a href="controlador?logica=ListaContatosLogic&restricao=foragidos"> <span class="glyphicon glyphicon-th-list"></span> Lista Foragidos</a>
                        </li>
                    </ul>
                </div>
            </nav>  
            <div id="page-wrapper" >
                <div id="page-inner">

                    <div class="page-header">
                        <h1>Atualiza Delitos </h1>
                    </div> 

                    <table class="table-responsive table-striped table-bordered ">

                        <tr>

                            <th>
                                <p>Save</p>
                            </th>
                            <th>
                                <p>Nome</p>
                            </th>
                            <th>
                                <p>CPF</p>
                            </th>
                            <th>
                                <p>Residência</p>
                            </th>
                            <th>
                                <p>Tipo De Delito</p>
                            </th>
                            <th>
                                <p>Data</p>
                            </th>
                            <th>
                                <p>Hora</p>
                            </th>
                            <th>
                                <p>Local</p>
                            </th>
                            <th>
                                <p>Estado</p>
                            </th>
                        </tr>
                        <c:forEach var ="delito" items ="${delitos}">
                            <tr>
                                <form action="controlador">


                                    <input type="hidden" name="id" value=${delito.id}>
                                        <input type="hidden" name="logica" value="AtualizaDelito">
                                            <td>
                                                <span class="glyphicon glyphicon-floppy-disk"></span>
                                                <input type="submit">
                                            </td>
                                            <td>
                                                <input type="text" name="nome" value=${delito.nome}>
                                            </td>
                                            <td>
                                                <input type="text" name="cpf" value=${delito.cpf}>
                                            </td>
                                            <td>
                                                <input type="text" name="residencia" value=${delito.residencia}>
                                            </td>
                                            <td>
                                                <input type="text" name="tipodedelito" value=${delito.tipoDeDelito}>
                                            </td>
                                             <td>
                                                <input type="text" name="data" value=${delito.data}>
                                            </td>
                                            <td>
                                                <input type="text" name="hora" value=${delito.hora}>
                                            </td>
                                            <td>
                                                <input type="text" name="localDoCrime" value=${delito.localDoCrime}>
                                            </td>
                                            <td>
                                                <input type="text" name="estado" value=${delito.estado}>
                                            </td>
                                            </form>
                                            </tr>
                                        </c:forEach>
                                        </table>
                                        <hr/>
                                        </div>
                                        </div>
                                        </div>




                                        <script src="assets/js/jquery-1.10.2.js"></script>
                                        <script src="assets/js/bootstrap.min.js"></script>
                                        <script src="assets/js/jquery.metisMenu.js"></script>
                                        <script src="assets/js/custom.js"></script>
                                        </body>
                                        </html>
