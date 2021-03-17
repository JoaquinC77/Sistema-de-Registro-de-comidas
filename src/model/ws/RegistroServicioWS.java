package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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
    
    public boolean getValidacionRegistroExistente(String idPasajero, int idServicio) throws MalformedURLException, IOException{
        String rutaCompleta = urlWS + "/validacionRegistroExistente?idPasajero=" + idPasajero + "&idServicio=" +idServicio;
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        HttpURLConnection conn = (HttpURLConnection) new URL(rutaCompleta).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : "
                    + conn.getResponseCode());
        }

        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;
        
        while ((output = br.readLine()) != null) {
            //System.out.println(output);

            boolean ok = Boolean.parseBoolean(output);
            System.out.println(ok);
            return ok;

        }

        return false;
    }
    
    public boolean insertRegistroServicio(String idPasajero, String idContrato, String idServicio) throws MalformedURLException, IOException {
        //boolean ok = false;

        String rutaCompleta = urlWS + "/registroServicio?idPas=" + idPasajero + "&idContra=" +idContrato+"&idSer=" + idServicio;
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        HttpURLConnection conn = (HttpURLConnection) new URL(rutaCompleta).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : "
                    + conn.getResponseCode());
        }

        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;

        while ((output = br.readLine()) != null) {
            //System.out.println(output);

            boolean ok = Boolean.parseBoolean(output);
            System.out.println(ok);
            return ok;

        }

        return false;
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
