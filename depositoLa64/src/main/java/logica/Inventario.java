
package logica;

import java.util.Date;

public class Inventario {
    
    int id_inventario;
    int productos;
    int minimoStock;
    Date fechaActualizacion;
    String proveedores;
    double precioUnidad;

    public Inventario() {
    }

    public Inventario(int id_inventario, int productos, int minimoStock, Date fechaActualizacion, String proveedores, double precioUnidad) {
        this.id_inventario = id_inventario;
        this.productos = productos;
        this.minimoStock = minimoStock;
        this.fechaActualizacion = fechaActualizacion;
        this.proveedores = proveedores;
        this.precioUnidad = precioUnidad;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public int getMinimoStock() {
        return minimoStock;
    }

    public void setMinimoStock(int minimoStock) {
        this.minimoStock = minimoStock;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getProveedores() {
        return proveedores;
    }

    public void setProveedores(String proveedores) {
        this.proveedores = proveedores;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
    
    
    
    
}
