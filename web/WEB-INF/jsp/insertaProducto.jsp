<%-- 
    Document   : insertaProducto
    Created on : 9/09/2020, 07:12:16 PM
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
        <title> Articulos Deportivos || Insertar Producto </title>
    </head>
    <body>
        <div class="container">
            <form method="POST" >
            <label> Tipo Producto </label>
            <input type="text" name="Tipoproducto" required class="form-control">
            <label>Nombre</label>
            <input type="text" name="Nombre" required="" class="form-control"> 
            <label> Descripción </label>
            <input type="text" name="Descripcion" required class="form-control">
            <label>Valor</label>
            <input type="number" name="Valor" required="" class="form-control"> 
            <label>Stock</label>
            <input type="number" name="Stock" required="" class="form-control"> 
                <br>
            <input type="submit" value="Agregar" class="btn btn-success">
            <br>
            
            </form>
        </div>
    </body>
</html>
