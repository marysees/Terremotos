package com.example.tarde.fragmentos;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by tarde on 03/02/2015.
 */
public class Terremoto implements Serializable{
     private String magnitud, localizacion;
    private Calendar fecha;

    public Terremoto(String magnitud, String localizacion, Calendar fecha) {
        this.magnitud = magnitud;
        this.localizacion = localizacion;
        this.fecha = fecha;
    }


    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Terremoto{" +
                "magnitud='" + magnitud + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
