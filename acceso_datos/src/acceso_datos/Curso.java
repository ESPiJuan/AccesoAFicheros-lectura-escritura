/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_datos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author JuanMi
 */
public class Curso implements Serializable {
    
    private String codigo,denominacion;
    private int numHoras;
    private LocalDate fechaInicion,fechaFin;

    public Curso(String codigo, String denominacion, int numHoras, LocalDate fechaInicion, LocalDate fechaFin) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.numHoras = numHoras;
        this.fechaInicion = fechaInicion;
        this.fechaFin = fechaFin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public LocalDate getFechaInicion() {
        return fechaInicion;
    }

    public void setFechaInicion(LocalDate fechaInicion) {
        this.fechaInicion = fechaInicion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
