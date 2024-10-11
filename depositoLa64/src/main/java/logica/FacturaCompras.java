
package logica;

import java.util.Date;


public class FacturaCompras {
    int id_FacturaCompra;
    Date fechaEmision;
    String proveedor;
    String quienPidio;
    String productosComprados;
    double montoTotalCompra;
    double valorPagadoCompra;
    int totalArticulosComprados;

    public FacturaCompras() {
    }

    public FacturaCompras(int id_FacturaCompra, Date fechaEmision, String proveedor, String quienPidio, String productosComprados, double montoTotalCompra, double valorPagadoCompra, int totalArticulosComprados) {
        this.id_FacturaCompra = id_FacturaCompra;
        this.fechaEmision = fechaEmision;
        this.proveedor = proveedor;
        this.quienPidio = quienPidio;
        this.productosComprados = productosComprados;
        this.montoTotalCompra = montoTotalCompra;
        this.valorPagadoCompra = valorPagadoCompra;
        this.totalArticulosComprados = totalArticulosComprados;
    }

    public int getId_FacturaCompra() {
        return id_FacturaCompra;
    }

    public void setId_FacturaCompra(int id_FacturaCompra) {
        this.id_FacturaCompra = id_FacturaCompra;
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

    public String getQuienPidio() {
        return quienPidio;
    }

    public void setQuienPidio(String quienPidio) {
        this.quienPidio = quienPidio;
    }

    public String getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(String productosComprados) {
        this.productosComprados = productosComprados;
    }

    public double getMontoTotalCompra() {
        return montoTotalCompra;
    }

    public void setMontoTotalCompra(double montoTotalCompra) {
        this.montoTotalCompra = montoTotalCompra;
    }

    public double getValorPagadoCompra() {
        return valorPagadoCompra;
    }

    public void setValorPagadoCompra(double valorPagadoCompra) {
        this.valorPagadoCompra = valorPagadoCompra;
    }

    public int getTotalArticulosComprados() {
        return totalArticulosComprados;
    }

    public void setTotalArticulosComprados(int totalArticulosComprados) {
        this.totalArticulosComprados = totalArticulosComprados;
    }
    
    
    
}
