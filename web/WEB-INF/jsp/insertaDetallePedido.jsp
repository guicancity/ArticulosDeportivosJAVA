<%-- 
    Document   : insertarDetallePedido
    Created on : 19/09/2020, 03:18:56 PM
    Author     : JEISSON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
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
        <title> Articulos Deportivos || Agregar producto </title>
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
        <div class="container mt-4">
            <div class="row">
                <div class="col-12">
                    <div class="row">
                        <div class="col text-center"> <h1> Detalle pedidos</h1> </div>
                    </div>
                    <form method="POST" >
                        <div class="row">
                            <div class="col-6">
                                <h5> Producto </h5>
                                <select name="idProducto" class="form-control" required>
                                    <c:forEach var="producto" items="${lsProductos}">
                                        <option value="${producto.id}"> ${producto.Nombre}</option>
                                    </c:forEach>
                                       
                                </select> 
                            </div>
                            <div class="col-6">
                                <h5>Cantidad</h5>
                                <input type="number" name="cantidad" required="" class="form-control"> 
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col text-center my-4">
                                <input type="submit" value="Agregar" class="btn btn-success" >
                            </div>
                        </div>           

                    </form>
                </div>
            </div>
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
