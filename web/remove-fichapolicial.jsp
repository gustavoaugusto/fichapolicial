﻿<!DOCTYPE html>
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
                            <a class="active-menu" href="controlador?logica=ListaContatosRemoveLogic"> <span class="glyphicon glyphicon-minus"></span> Remove Delitos</a>
                        </li>
                        <li>
                            <a href="controlador?logica=ListaContatosLogic&restricao=atualiza"> <span class="glyphicon glyphicon-pencil"></span> Atualiza Delitos</a>
                        </li>
                        <li>
                            <a href="controlador?logica=ListaContatosLogic"> <span class="glyphicon glyphicon-th-list"></span> Lista Delitos</a>
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
                        <h1>Remove Delito </h1>
                    </div> 

                    <table class="table-responsive table-striped">

                        <tr>
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
                                <p>Hora</p>
                            </th>
                            <th>
                                <p>Local</p>
                            </th>
                            <th>
                                <p>Estado</p>
                            </th>
                            <th>
                                <p></p>
                            </th>
                        </tr>
                        <c:forEach var ="delito" items ="${delitos}">
                            <tr>
                                <td>
                                    <p>${delito.nome}</p>
                                </td>
                                <td>
                                    <p>${delito.cpf}</p>
                                </td>
                                <td>
                                    <p>${delito.residencia}</p>
                                </td>
                                <td>
                                    <p>${delito.tipoDeDelito}</p>
                                </td>
                                <td>
                                    <p>${delito.hora}</p>
                                </td>
                                <td>
                                    <p>${delito.localDoCrime}</p>
                                </td>
                                <td>
                                    <p>${delito.estado}</p>
                                </td>
                                <td>
                                    <a href="controlador?logica=RemoveDelito&id=${delito.id}"> <button class="btn-primary"> Remover </button> </a>
                                </td>
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
