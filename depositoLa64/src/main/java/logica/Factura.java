
package logica;

import java.util.Date;


public class Factura {
    
    int id_factura;
    Date fechaEmision;
    String cliente;
    String productosVendidos;
    String empleadoVendedor;
    double montoTotalFactura;
    double valorPagado;
    double cambio;
    int totalArticulos;

    public Factura() {
    }

    public Factura(int id_factura, Date fechaEmision, String cliente, String productosVendidos, String empleadoVendedor, double montoTotalFactura, double valorPagado, double cambio, int totalArticulos) {
        this.id_factura = id_factura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.productosVendidos = productosVendidos;
        this.empleadoVendedor = empleadoVendedor;
        this.montoTotalFactura = montoTotalFactura;
        this.valorPagado = valorPagado;
        this.cambio = cambio;
        this.totalArticulos = totalArticulos;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(String productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public String getEmpleadoVendedor() {
        return empleadoVendedor;
    }

    public void setEmpleadoVendedor(String empleadoVendedor) {
        this.empleadoVendedor = empleadoVendedor;
    }

    public double getMontoTotalFactura() {
        return montoTotalFactura;
    }

    public void setMontoTotalFactura(double montoTotalFactura) {
        this.montoTotalFactura = montoTotalFactura;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public int getTotalArticulos() {
        return totalArticulos;
    }

    public void setTotalArticulos(int totalArticulos) {
        this.totalArticulos = totalArticulos;
    }
    
    
    
}
