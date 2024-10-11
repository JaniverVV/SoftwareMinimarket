
package logica;


public class DetalleFacturaCompra {
    
    int id_detalleFacturaCompra;
    String nombre;
    double precioUnidad;
    String categoria;
    double subTotal;
    String descripcion;
    int cantidadProducto;

    public DetalleFacturaCompra() {
    }

    public DetalleFacturaCompra(int id_detalleFacturaCompra, String nombre, double precioUnidad, String categoria, double subTotal, String descripcion, int cantidadProducto) {
        this.id_detalleFacturaCompra = id_detalleFacturaCompra;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.categoria = categoria;
        this.subTotal = subTotal;
        this.descripcion = descripcion;
        this.cantidadProducto = cantidadProducto;
    }

    public int getId_detalleFacturaCompra() {
        return id_detalleFacturaCompra;
    }

    public void setId_detalleFacturaCompra(int id_detalleFacturaCompra) {
        this.id_detalleFacturaCompra = id_detalleFacturaCompra;
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
