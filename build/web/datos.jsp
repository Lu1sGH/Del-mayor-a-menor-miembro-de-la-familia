<%-- 
    Document   : datos
    Created on : 29/03/2022, 05:09:26 PM
    Author     : Axel Zarate Lozano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos de la familia.</title>
    </head>
    <body background="atardecer.jpg">
        <h1>¡Ingresa los datos de tu familia!</h1>
        <%
            int edadA = 13;
            int edadB = 45;
            int edadC = 43;
            String nombreA = "Jennifer";
            String nombreB = "Jose";
            String nombreC = "Carolina";
            String url = "datosServlet";
        %>
        <p>
            <b>Nombre 1</b>: <%=nombreA%> <br>
            <b>Edad 1</b>: <%=edadA%> <br>
            <br>
            <b>Nombre 2</b>: <%=nombreB%> <br>
            <b>Edad 2</b>: <%=edadB%> <br>
            <br>
            <b>Nombre 3</b>: <%=nombreC%> <br>
            <b>Edad 3</b>: <%=edadC%> <br>
        </p>
        <%
            url += "?nA=" + nombreA + "&eA=" + edadA + "&nB=" + nombreB + "&eB=" + edadB + "&nC=" + nombreC + "&eC=" + edadC;
        %>
        
        <a href="<%=url%>"> <h3> Conoce el resultado </h3> </a>
        
        <h3> Acerca de la familia </h3>
        <b> &iquest;Qu&eacute; es la familia? </b>
        <br>
        <iframe width="560" height="315" src="https://www.youtube.com/embed/9p6DjK7NMTI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        <br> <br> <img src="familia.jpg">
        <br> Ilustración de la familia nuclear
    </body>
</html>
