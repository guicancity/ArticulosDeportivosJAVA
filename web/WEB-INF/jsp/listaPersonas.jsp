<%-- 
    Document   : listaPersonas
    Created on : 8/09/2020, 10:00:40 AM
    Author     : JEISSON
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <title> Articulos Deportivos || Clientes </title>
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
            <a href="insertaPersona.txt" type="button" class="btn btn-success"  > Nuevo registro</a>
           <h1 class="text-center">Personas</h1>
            
            <table class="table table-hover">
                <thead class="thead-light">
                    <tr>
                        
                        
                        <th>Nombre completo</th>
                        <th>Dirección</th>
                        <th>Celular</th>
                        <th>Tipo de documento</th>
                        <th>Numero de documento</th>
                        <th>Fecha de nacimiento</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    
     
                    <c:forEach var="persona" items="${lsPersona}">
                                <tr>                               
                                    <td>${persona.nombre1} ${persona.nombre2} ${persona.apellido1} ${persona.apellido2}</td>
                                    <td>${persona.direccion}</td>
                                    <td>${persona.celular}</td>
                                    <td>${persona.tipoDocumento}</td>                                    
                                    <td>${persona.numeroDocumento}</td>
                                    <td>${persona.fechaNacimiento}</td>
                                   <td>
                                        <a href="editarPersona.txt?id=${persona.id}" class="btn btn-outline-info">Editar</a>                                        
                                        <a onclick="return confirm('¿Esta seguro?');" href="deletePersona.txt?id=${persona.id}" 
                                           class="btn btn-outline-danger">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                    
                </tbody>
                
            </table>
            
        </div>
    </body>
</html>
