
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearClientes(Cliente miCliente){
    
    controlPersis.crearCliente(miCliente);
    
    }
    
    public List<Cliente> traerClientes(){
    
    return controlPersis.traerClientes();
    }
    
    
}
