
package logica;

import java.util.Date;


public class Producto {
    
    int id_Producto;
    String nombre;
    double precioSugerido;
    String categoria;
    int cantidadStock;
    String descripcion;
    Date FechaVencimiento;
    String proveedor;

    public Producto() {
    }

    public Producto(int id_Producto, String nombre, double precioSugerido, String categoria, int cantidadStock, String descripcion, Date FechaVencimiento, String proveedor) {
        this.id_Producto = id_Producto;
        this.nombre = nombre;
        this.precioSugerido = precioSugerido;
        this.categoria = categoria;
        this.cantidadStock = cantidadStock;
        this.descripcion = descripcion;
        this.FechaVencimiento = FechaVencimiento;
        this.proveedor = proveedor;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioSugerido() {
        return precioSugerido;
    }

    public void setPrecioSugerido(double precioSugerido) {
        this.precioSugerido = precioSugerido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
