package model.ws;

import app.InicioTrabajador;
import app.InicioUsuario;
import static app.Login.tipouser;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import model.clases.Usuario;

/**
 *
 * @author Santo Tomás
 */
public class LoginWS {

    private String urlWS;

    public LoginWS() {
        this.urlWS = "http://localhost:8080";
    }

    public Usuario loginIniciar(String rut, String pass) throws MalformedURLException, IOException {
        String urlWS = "http://localhost:8080/usuario?rut=" + rut + "&pass=" + pass;
        URL url = new URL(urlWS);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
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
            System.out.println(output);
            JsonParser parser = new JsonParser();
            JsonObject json = (JsonObject) parser.parse(output);

            Usuario usuario = new Gson().fromJson(json, Usuario.class);
            System.out.println(usuario.toString());
            return usuario;

        }

        return null;
    }

}
