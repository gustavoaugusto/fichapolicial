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
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="anonimo.jpg" class="img-responsive img-rounded"/>
                        </li>
                        <li>
                            <a href="index.jsp"><span class="glyphicon glyphicon-home"></span> HOME</a>
                        </li>
                        <li>
                            <a class="active-menu" href="cadastra-fichapolicial.jsp"><span class="glyphicon glyphicon-plus"></span> Cria Ocorrência </a>
                        </li>   
                        <li>
                            <a href="controlador?logica=ListaContatosRemoveLogic"> <span class="glyphicon glyphicon-minus"></span> Remove Delitos</a>
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
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper" >
                <div id="page-inner">
                    <div class="page-header">
                        <h1>Registrar Delito </h1>
                    </div>         


                    <div class="row">

                        <div class="col-md-6 ">
                            <form role="form" action="controlador">

                                <input type="hidden" name="logica" value="AdicionaDelito">

                                    <div class="form-group">
                                        <label for="nome">Nome</label>
                                        <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome do meliante">
                                    </div>
                                    <div class="form-group">
                                        <label for="cpf">CPF</label>
                                        <input type="text" class="form-control" id="cpf" name="cpf" placeholder="CPF do meliante">
                                    </div>
                                    <div class="form-group">
                                        <label for="residencia">Residencia:</label>
                                        <input type="text" class="form-control" id="residencia" name="residencia">
                                    </div>
                                    <div class="form-group">
                                        <label for="tipodedelito">Tipo de Delito</label>
                                        <input type="text" class="form-control" id="tipodedelito" name="tipodedelito">
                                    </div>
                                    <div class="form-group">
                                        <label for="data">Data:</label>
                                        <input type="text" class="form-control" id="data" name="data">
                                            <p class="help-block">Digite no formato: aaaa-mm-dd</p>
                                    </div>
                                    <div class="form-group">
                                        <label for="hora">Hora:</label>
                                        <input type="text" class="form-control" id="hora" name="hora">
                                    </div>
                                    <div class="form-group">
                                        <label for="localDoCrime">Local do Crime:</label>
                                        <input type="text" class="form-control" id="localDoCrime" name="localDoCrime">
                                    </div>
                                    <div class="form-group">
                                        <label>Estado</label>
                                        <select multiple="" class="form-control" name="estado">
                                            <option>Procurado</option>
                                            <option>Foragido</option>
                                            <option>Solto</option>
                                        </select>
                                    </div>

                                    <button type="submit" class="btn btn-default">Salvar</button>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /. PAGE INNER  -->
            </div>
            <!-- /. PAGE WRAPPER  -->
        </div>
        <!-- /. WRAPPER  -->
        <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
        <!-- JQUERY SCRIPTS -->
        <script src="assets/js/jquery-1.10.2.js"></script>
        <!-- BOOTSTRAP SCRIPTS -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- METISMENU SCRIPTS -->
        <script src="assets/js/jquery.metisMenu.js"></script>
        <!-- CUSTOM SCRIPTS -->
        <script src="assets/js/custom.js"></script>


    </body>
</html>
