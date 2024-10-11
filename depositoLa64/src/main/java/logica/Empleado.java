
package logica;

import java.util.Date;


public class Empleado {
    
     int id_empleado;
     String nombre;
     String apellido;
     String cargo;
     Date fechaDeContrato;
     double salario;
     String telefono;
     String correoElectronico;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String apellido, String cargo, Date fechaDeContrato, double salario, String telefono, String correoElectronico) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.fechaDeContrato = fechaDeContrato;
        this.salario = salario;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaDeContrato() {
        return fechaDeContrato;
    }

    public void setFechaDeContrato(Date fechaDeContrato) {
        this.fechaDeContrato = fechaDeContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
     
     
     
}
