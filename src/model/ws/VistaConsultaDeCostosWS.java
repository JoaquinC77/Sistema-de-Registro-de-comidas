package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import model.clases.VistaConsultaDeCostos;

public class VistaConsultaDeCostosWS {
    private String urlWs;
    private HttpURLConnection conn;

    public VistaConsultaDeCostosWS() {
        this.urlWs = "http://localhost:8080";
    }
    
    public VistaConsultaDeCostos getCostosPorContrato(String codigo) throws MalformedURLException, IOException {
        VistaConsultaDeCostos costosPorContrato = null;

        String urlWS = this.urlWs + "/getCostos?codigo=" + codigo;
        URL url = new URL(urlWS);

        JsonObject jsonObject = new ConexionWS().getJsonObject(url);

        costosPorContrato = new Gson().fromJson(jsonObject, VistaConsultaDeCostos.class);
        
        if(costosPorContrato.getCantidadDesayunosServidos() == null){
            costosPorContrato.setCantidadDesayunosServidos("0");
        }
        if(costosPorContrato.getCantidadAlmuerzoServidos()== null){
            costosPorContrato.setCantidadAlmuerzoServidos("0");
        }
        if(costosPorContrato.getCantidadCenasServidas() == null){
            costosPorContrato.setCantidadCenasServidas("0");
        }
        if(costosPorContrato.getCantidadTrabajadores()== null){
            costosPorContrato.setCantidadTrabajadores("0");
        }

        return costosPorContrato;
    }
    
    
}
