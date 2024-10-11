
package logica;

import java.util.Date;


public class Venta {
    
    int id_venta;
    Date fechaVenta;
    String cliente;
    int productosVendidos;
    double ventaTotal;
    double empleadoVendedor;
    double valorPagado;

    public Venta() {
    }

    public Venta(int id_venta, Date fechaVenta, String cliente, int productosVendidos, double ventaTotal, double empleadoVendedor, double valorPagado) {
        this.id_venta = id_venta;
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.productosVendidos = productosVendidos;
        this.ventaTotal = ventaTotal;
        this.empleadoVendedor = empleadoVendedor;
        this.valorPagado = valorPagado;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public double getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(double ventaTotal) {
        this.ventaTotal = ventaTotal;
    }

    public double getEmpleadoVendedor() {
        return empleadoVendedor;
    }

    public void setEmpleadoVendedor(double empleadoVendedor) {
        this.empleadoVendedor = empleadoVendedor;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }
    
    
    
}
