
package logica;

import java.util.Date;


public class OrdenPedido {
    
    int id_ordenPedido;
    Date fechaEmision;
    String proveedor;
    String listaProductos;
    String estado;
    String totalPedido;

    public OrdenPedido() {
    }

    public OrdenPedido(int id_ordenPedido, Date fechaEmision, String proveedor, String listaProductos, String estado, String totalPedido) {
        this.id_ordenPedido = id_ordenPedido;
        this.fechaEmision = fechaEmision;
        this.proveedor = proveedor;
        this.listaProductos = listaProductos;
        this.estado = estado;
        this.totalPedido = totalPedido;
    }

    public int getId_ordenPedido() {
        return id_ordenPedido;
    }

    public void setId_ordenPedido(int id_ordenPedido) {
        this.id_ordenPedido = id_ordenPedido;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(String listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(String totalPedido) {
        this.totalPedido = totalPedido;
    }
    
    
}
