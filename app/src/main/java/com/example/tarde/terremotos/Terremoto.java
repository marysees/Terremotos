package com.example.tarde.terremotos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by tarde on 03/02/2015.
 */
public class Terremoto implements Serializable {
    private String id, titulo, link, localizacion;
    private Date fecha;
    private float latitud, longitud, magnitud;

    public static final String TABLA = "TERREMOTOS";
    public static final String CAMPO_ID = "ID";
    public static final String CAMPO_TITULO = "TITULO";
    public static final String CAMPO_LINK = "LINK";
    public static final String CAMPO_LOCALIZACION = "LOCALIZACION";
    public static final String CAMPO_FECHA = "FECHA";
    public static final String CAMPO_LATITUD = "LATITUD";
    public static final String CAMPO_LONGITUD = "LONGITUD";
    public static final String CAMPO_MAGNITUD = "MAGNITUD";


    public Terremoto() {
        super();
    }


    public Terremoto(String id, String titulo, String link, String localizacion, Date fecha, float latitud, float longitud, float magnitud) {
        this.id = id;
        this.titulo = titulo;
        this.link = link;
        this.localizacion = localizacion;
        this.fecha = fecha;
        this.latitud = latitud;
        this.longitud = longitud;
        this.magnitud = magnitud;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(float magnitud) {
        this.magnitud = magnitud;
    }

    @Override
    public String toString() {
        return "Terremoto{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", link='" + link + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", fecha=" + fecha +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", magnitud=" + magnitud +
                '}';
    }
}



