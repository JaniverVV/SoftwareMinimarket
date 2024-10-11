
package logica;


public class DetalleFactura {
    
    int id_detalleDactura;
    String nombre;
    double precioUnidad;
    String categoria;
    double iva;
    double subTotal;
    String descripcion;
    int cantidadProducto;

    public DetalleFactura() {
    }

    public DetalleFactura(int id_detalleDactura, String nombre, double precioUnidad, String categoria, double iva, double subTotal, String descripcion, int cantidadProducto) {
        this.id_detalleDactura = id_detalleDactura;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.categoria = categoria;
        this.iva = iva;
        this.subTotal = subTotal;
        this.descripcion = descripcion;
        this.cantidadProducto = cantidadProducto;
    }

    public int getId_detalleDactura() {
        return id_detalleDactura;
    }

    public void setId_detalleDactura(int id_detalleDactura) {
        this.id_detalleDactura = id_detalleDactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    
    
    
}
