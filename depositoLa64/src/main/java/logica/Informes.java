
package logica;

import java.util.Date;


public class Informes {
    
    int id_informes;
    Date fechaGenerado;
    String tipoInforme;
    String contenidoInforme;

    public Informes() {
    }

    public Informes(int id_informes, Date fechaGenerado, String tipoInforme, String contenidoInforme) {
        this.id_informes = id_informes;
        this.fechaGenerado = fechaGenerado;
        this.tipoInforme = tipoInforme;
        this.contenidoInforme = contenidoInforme;
    }

    public int getId_informes() {
        return id_informes;
    }

    public void setId_informes(int id_informes) {
        this.id_informes = id_informes;
    }

    public Date getFechaGenerado() {
        return fechaGenerado;
    }

    public void setFechaGenerado(Date fechaGenerado) {
        this.fechaGenerado = fechaGenerado;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }

    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public String getContenidoInforme() {
        return contenidoInforme;
    }

    public void setContenidoInforme(String contenidoInforme) {
        this.contenidoInforme = contenidoInforme;
    }
    
    
    
    
}
