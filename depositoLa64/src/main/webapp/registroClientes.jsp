<%-- 
    Document   : registroClientes
    Created on : 23/06/2024, 4:15:15 a. m.
    Author     : Home
--%>

<%@page import="logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               <%
        
        List<Cliente> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
        
        int cont = 0;
        
        for(Cliente miCliente: listaUsuarios){ %>
            
            <p>Cliente N <%=cont%></p>
            <p>Id <%=miCliente.getId_Cliente()%></p>
            
            <p>nombre<%=miCliente.getNombres()%></p>
            
            <p>telefono<%=miCliente.getTelefono()%></p>
            <p>-------------------------</p>
            <% cont = cont + 1;%>
            
            
            <%}%>
    </body>
</html>
