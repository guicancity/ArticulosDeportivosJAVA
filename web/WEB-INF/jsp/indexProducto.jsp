<%-- 
    Document   : indexProducto
    Created on : 8/09/2020, 10:03:40 AM
    Author     : Xiomara
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
        <title> Articulos Deportivos || Producto </title>
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
                    <a class="nav-link" href="#">Pedido</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="persona.txt">Cliente</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Factura</a>
                </li>
            </ul>
        </div>
    </nav>
        <div class="container pt-3"> 
            <a href="" class="btn btn-success"> Nuevo Registro </a>
            <h1 class="text-center"> Productos </h1>
            <br>
        <table class="table table-hover">
            <thead class="thead-light">
                <tr>                               
                    <th>Tipo Producto</th>                               
                    <th>Nombre</th>
                    <th>Descripcion</th>
                    <th>Valor</th>
                    <th>Stock</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="producto" items="${lsProductos}">
                    <tr>                               
                        <td>${producto.tipoproducto}</td>
                        <td>${producto.nombre}</td> 
                        <td>${producto.descripcion}</td> 
                        <td>${producto.valor}</td> 
                        <td>${producto.stock}</td>
                        <td>
                            <a href="editarProducto.txt?id=${producto.id}" class="btn btn-outline-info"> Editar</a>
                            <a onclick="return confirm('¿Esta seguro?');" href="deleteProducto.txt?id=${producto.id}" class="btn btn-outline-danger"> Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </div>
    </body>
</html>
