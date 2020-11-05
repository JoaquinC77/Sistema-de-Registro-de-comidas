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
public class EmpresaPasajero {
    private String id;
    private String idEmpresa;
    private String idPasajero;

    public EmpresaPasajero(String id, String idEmpresa, String idPasajero) {
        this.id = id;
        this.idEmpresa = idEmpresa;
        this.idPasajero = idPasajero;
    }

    public EmpresaPasajero() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }
}
