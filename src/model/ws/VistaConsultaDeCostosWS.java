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
    
    public VistaConsultaDeCostos getCostosPorContrato(String codigo, String fechaDesde, String fechaHasta) throws MalformedURLException, IOException {
        VistaConsultaDeCostos costosPorContrato = null;

        String urlWS = this.urlWs + "/getCostos?codigo=" + codigo +"&fechaDesde="+fechaDesde+"&fechaHasta="+fechaHasta;
        URL url = new URL(urlWS);

        JsonObject jsonObject = new ConexionWS().getJsonObject(url);

        costosPorContrato = new Gson().fromJson(jsonObject, VistaConsultaDeCostos.class);
        
        if(costosPorContrato.getCantidadDesayunosServidos() == 0){
            costosPorContrato.setCantidadDesayunosServidos(0);
        }
        if(costosPorContrato.getCantidadAlmuerzoServidos()== 0){
            costosPorContrato.setCantidadAlmuerzoServidos(0);
        }
        if(costosPorContrato.getCantidadCenasServidas() == 0){
            costosPorContrato.setCantidadCenasServidas(0);
        }
        if(costosPorContrato.getCantidadTrabajadores()== 0){
            costosPorContrato.setCantidadTrabajadores(0);
        }

        return costosPorContrato;
    }
    
    
}
