package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import model.clases.EmpresaPasajero;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class EmpresaPasajeroWS {
    private String urlWS;

    public EmpresaPasajeroWS() {
        this.urlWS = "http://localhost:8080";
    }
    
    public boolean insertEmpresaPasajero(String idPasajero, String idEmpresa) throws MalformedURLException, IOException{
        String parametros = "idEmpresa="+idEmpresa+"&idPasajero="+idPasajero;
         //Ruta completa del host+parametros a enviar
        String rutaCompleta = urlWS + "/empresaPasajero?" + parametros;
        
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
    
    public boolean updateEmpresPasajero(String idEmpresaNueva, String idPasajero, String idEmpresaAntigua) throws MalformedURLException, IOException{
        String parametros = "idPasajero="+idPasajero+"&idEmpresaNueva="+idEmpresaNueva+"&idEmpresaAntigua="+idEmpresaAntigua;
        //Ruta completa del host+parametros a enviar
        String rutaCompleta = urlWS + "/updateEmpresaPasajero?" + parametros;
        
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        
        boolean ok = Boolean.parseBoolean(new ConexionWS().getStringResponse(new URL(rutaCompleta)));
        
        return ok;
    }
    
    public EmpresaPasajero getEmpresaPasajeroForIdPasajero(String idPasajero) throws MalformedURLException, IOException{
        String parametros = "idPasajero="+idPasajero;
         //Ruta completa del host+parametros a enviar
        String rutaCompleta = urlWS + "/getEmpresaPasajeroForIDPasajero?" + parametros;
        
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        
        JsonObject jsonObject = new ConexionWS().getJsonObject(new URL(rutaCompleta));
        
        EmpresaPasajero ep = new Gson().fromJson(jsonObject, EmpresaPasajero.class);
        
        if(ep != null){
            return ep;
        }else{
            return null;
        }
    }
    
}
