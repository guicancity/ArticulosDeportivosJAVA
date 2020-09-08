<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="bootstrap/js/jquery-3.4.1.js"></script>
        <script src="bootstrap/js/popper.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <title> Articulos Deportivos || Inicio </title>
    </head>

    <body>
    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
        <!-- Brand -->
        <a class="navbar-brand" href="#">Inicio</a>

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
    <div id="demo" class="carousel slide" data-ride="carousel">

        <!-- Indicators -->
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
        </ul>

        <!-- The slideshow -->
       
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img height="550px" width="100%" src="Imagenes/1.jpg">
            </div>
            <div class="carousel-item">
                <img height="550px" width="100%"  src="Imagenes/2.jpg">
            </div>
            <div class="carousel-item">
                <img height="550px" width="100%"  src="Imagenes/3.jpg">
            </div>
            
        </div>

        <!-- Left and right controls -->
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>

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
