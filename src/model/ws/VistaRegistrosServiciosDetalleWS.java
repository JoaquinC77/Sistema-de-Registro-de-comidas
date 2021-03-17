package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import model.clases.Pasajero;
import model.clases.VistaRegistrosServiciosDetalle;

public class VistaRegistrosServiciosDetalleWS {
    private String urlWs;
    private ConexionWS conn;

    public VistaRegistrosServiciosDetalleWS() {
        this.urlWs = "http://localhost:8080";
        conn = new ConexionWS();
    }
    
    
    public List<VistaRegistrosServiciosDetalle> getRegistroDetallado(String idContrato, String fechaDesde, String fechaHasta) throws MalformedURLException, IOException{
        VistaRegistrosServiciosDetalle vistaRegistros = null;
        List<VistaRegistrosServiciosDetalle> lista = new ArrayList<>();
        
        String rutaCompleta = urlWs+"/getRegistrosDetallados?idContrato="+idContrato+"&fechaDesde="+fechaDesde+"&fechaHasta="+fechaHasta;
        URL url = new URL(rutaCompleta);
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        
        JsonArray jsonArray = conn.getJsonArray(url);
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObject = (JsonObject) jsonArray.get(i);
            vistaRegistros =  new Gson().fromJson(jsonObject, VistaRegistrosServiciosDetalle.class);
            
            lista.add(vistaRegistros);
            
        }
        
        return lista;
    }
    
}
