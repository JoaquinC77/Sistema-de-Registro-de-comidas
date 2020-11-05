package model.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class RegistroServiciosWS {

    private String urlWS;

    public RegistroServiciosWS() {
        this.urlWS = "http://localhost:8080";
    }

    public boolean insertRegistroServicio(String idPasajero, String idServicio) throws MalformedURLException, IOException {
        //boolean ok = false;

        String rutaCompleta = urlWS + "/registroServicio?idPas=" + idPasajero + "&idSer=" + idServicio;
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

}
