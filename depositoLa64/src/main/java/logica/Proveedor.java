
package logica;


public class Proveedor {
    
    int id_proveedor;
    String nombre;
    String correo;
    String telefono;
    String ordenPedido;
    String productoSuministrado;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String nombre, String correo, String telefono, String ordenPedido, String productoSuministrado) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.ordenPedido = ordenPedido;
        this.productoSuministrado = productoSuministrado;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOrdenPedido() {
        return ordenPedido;
    }

    public void setOrdenPedido(String ordenPedido) {
        this.ordenPedido = ordenPedido;
    }

    public String getProductoSuministrado() {
        return productoSuministrado;
    }

    public void setProductoSuministrado(String productoSuministrado) {
        this.productoSuministrado = productoSuministrado;
    }
    
    
    
}
