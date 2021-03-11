package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import model.clases.Pasajero;
import model.clases.RegistroServicios;

public class RegistroServicioWS {

    private String urlWS;
    private ConexionWS convert;

    public RegistroServicioWS() {
        this.urlWS = "http://localhost:8080";
        convert = new ConexionWS();
    }
    
    public List<RegistroServicios> getRegistrosPorPasajeroyContrato(String idPasajero, String idContrato) throws MalformedURLException, IOException{
        RegistroServicios registro = null;
        List<RegistroServicios> listaRegistros = new ArrayList<>();
        
        String rutaCompleta = urlWS + "/getRegistrosPorPasajero?idPasajero=" + idPasajero +"&idContrato="+idContrato;
        URL url = new URL(rutaCompleta);
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        
        JsonArray jsonArray = convert.getJsonArray(url);
        
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObject = (JsonObject) jsonArray.get(i);
            registro =  new Gson().fromJson(jsonObject, RegistroServicios.class);
            
            listaRegistros.add(registro);
            
        }
        
        return listaRegistros;
        
    }
    
    

}
