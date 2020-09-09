<%-- 
    Document   : agregarPersona
    Created on : 8/09/2020, 04:38:29 PM
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

        <div class="container">
            <form method="POST">
                <label>primer nombre</label>
                <input type="text" name="nombre1" required="" class="form-control">
                <label>Segundo nombre</label>
                <input type="text" name="nombre2"  class="form-control">
                <label>Primer apellido</label>
                <input type="text" name="apellido1" required="" class="form-control">
                <label>Segundo apellido</label>
                <input type="text" name="apellido2"  class="form-control">
                <label>Direccion</label>
                <input type="text" name="direccion" required="" class="form-control">
                <label>Celular</label>
                <input type="text" name="celular" required="" class="form-control">
                <label>Tipo de documento</label>
                <input type="text" name="tipoDocumento" required="" class="form-control">
                <label>Numero de documento</label>
                <input type="text" name="numeroDocumento" required="" class="form-control">
                <label>Fecha de nacimiento</label>
                <input type="date" name="fechaNacimiento" required="" class="form-control">

                <input type="submit" value="Agregar" class="btn btn-success" >

            </form>
        </div>
    </div>
</div>
</div>
</body>
</html>
