package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import model.clases.Pasajero;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class PasajeroWS {

    private String urlWS;
    private ConexionWS convert;

    public PasajeroWS() {
        this.urlWS = "http://localhost:8080";
        convert = new ConexionWS();
    }

    public Pasajero getPasajero(String rut) throws MalformedURLException, IOException {
        Pasajero p = null;

        String rutaCompleta = urlWS + "/pasajeroRut?rut=" + rut;
        URL url = new URL(rutaCompleta);
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        
        JsonObject jsonObject = convert.getJsonObject(url);
        
        p = new Gson().fromJson(jsonObject, Pasajero.class);

        return p;

    }
    
    public List<Pasajero> getPasajerosPorContrato(String codigoContrato) throws MalformedURLException, IOException {
        Pasajero p = null;
        List<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
        
        String rutaCompleta = urlWS + "/pasajerosPorContrato?codigoContrato=" + codigoContrato;
        URL url = new URL(rutaCompleta);
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        
        JsonArray jsonArray = convert.getJsonArray(url);
        
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObject = (JsonObject) jsonArray.get(i);
            p =  new Gson().fromJson(jsonObject, Pasajero.class);
            
            listaPasajeros.add(p);
            
        }
        
        return listaPasajeros;

    }
    
    public boolean insertPasajero(Pasajero p) throws MalformedURLException, IOException{
         //Conversion de parametos a taves de URLEncoder.encode para el paso sin conflictos de variables con espacios
        String parametros = "cod="+p.getCodigo()+"&nam="+URLEncoder.encode(p.getNombre(), "UTF-8")+"&apeP="+p.getApellidoP()+"&apeM="+p.getApellidoM()+"&rut="+p.getRut()+"&direc="+URLEncoder.encode(p.getDireccion(), "UTF-8");

        //Ruta completa del host+parametros a enviar
        String rutaCompleta = urlWS + "/insertPasajero?" + parametros;
        
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");

        //Se establece una conexion a la ruta indicada anteriormente
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
}
