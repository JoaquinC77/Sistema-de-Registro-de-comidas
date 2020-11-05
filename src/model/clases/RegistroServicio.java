/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clases;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class RegistroServicio {
    private String id;
    private String idPasajero;
    private String idServicio;
    private String fecha;

    public RegistroServicio(String id, String idPasajero, String idServicio, String fecha) {
        this.id = id;
        this.idPasajero = idPasajero;
        this.idServicio = idServicio;
        this.fecha = fecha;
    }

    public RegistroServicio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
