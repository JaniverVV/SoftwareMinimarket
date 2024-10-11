
package persistencia;

import java.util.List;
import logica.Cliente;


public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    
    
    //CREATE
    
    public void crearCliente(Cliente miCliente){
    
    clienteJpa.create(miCliente);
    }
    
    
    //READ
    
   public List<Cliente> traerClientes (){
   
       return clienteJpa.findClienteEntities();
   }
    
}
