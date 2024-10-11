package com.mycompany.depositola64.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Cliente;
import logica.ControladoraLogica;

@WebServlet(name = "SvCliente", urlPatterns = {"/SvCliente"})
public class SvCliente extends HttpServlet {
    
    //-----------------------------------------------------------------------
    
    
    ControladoraLogica control = new ControladoraLogica();
    
    
    //------------------------------------------------------------------------

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes = control.traerClientes();
        
       HttpSession misesion = request.getSession();
        misesion.setAttribute("listaClientes",listaClientes);
       response.sendRedirect("registroClientes.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        

        String nombre = request.getParameter("nombre");
        String cedula = request.getParameter("cedula");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        
        Cliente miCliente = new Cliente();
        miCliente.setNombres(nombre);
        miCliente.setCedula(cedula);
         miCliente.setTelefono(telefono);
         miCliente.setCorreo(correo);
         miCliente.setDireccion(direccion);
        
        
        
      
        control.crearClientes(miCliente);
        
        //System.out.println("estos son los datos: " + nombre + cedula + telefono + correo + direccion);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
