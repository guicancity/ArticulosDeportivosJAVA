<%-- 
    Document   : indexFactura
    Created on : 19/09/2020, 06:41:45 PM
    Author     : Xiomara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="bootstrap/js/jquery-3.4.1.js"></script>
        <script src="bootstrap/js/popper.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="bootstrap/estilos.css">
        <link rel="stylesheet" href="bootstrap/font-awesome/css/font-awesome.min.css">
        <title> Articulos Deportivos || Factura </title>
    </head>
    <body>
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
            <!-- Brand -->
            <a class="navbar-brand" href="index.txt">Inicio</a>

            <!-- Toggler/collapsibe Button -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="producto.txt">Productos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="pedido.txt">Pedido</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="persona.txt">Cliente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="factura.txt">Factura</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container pt-3">
            <a href="insertaFactura.txt" class="btn btn-success"> Nuevo Registro </a>
            <h1 class="text-center"> Pedidos </h1>
            <br>
            <table class="table table-hover">
                <thead class="thead-light">
                    <tr>  
                        <th>Cliente</th> 
                        <th>Fecha Entrega</th>
                        <th>Observaciones</th>
                        <th>Estado</th>
                        <th colspan="3" class="text-center">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="factura" items="${lsFactura}">
                    <tr>                               
                        <td>${factura.idPedido} ${pedidos.idPersona1} ${pedidos.idPersona2} ${pedidos.idPersona3}</td>
                        <td>${factura.estado}</td> 
                        <td>
                            <a href="editarFactura.txt?id=${factura.id}" class="btn btn-outline-info fa fa-edit fa-2x"> </a>
                        </td>
                        <td>
                            <a onclick="return confirm('¿Esta seguro?');" href="deleteFactura.txt?id=${factura.id}" class="btn btn-outline-danger fa fa-trash fa-2x"> </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <footer class="footer text-center p-4" style="background: black">
            <div class="container">
                <div class="row" >

                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <h4 class="text-uppercase mb-4" style="color: white"> Contactanos </h4>
                        <p class="lead mb-0" style="color: white"> jfex@hotmail.com</p>
                    </div>

                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <h4 class="text-uppercase mb-4" style="color: white">Derechos Reservados &copy; 2020 JFEX </h4>
                    </div>

                    <div class="col-lg-4">
                        <h4 class="text-uppercase mb-4" style="color: white"> Llamanos </h4>
                        <p class="lead mb-0">
                        <p class="lead mb-0" style="color: white"> (+57) 3112827980</p>
                    </div>

                </div>
            </div>
        </footer>
    </body>
</html>

