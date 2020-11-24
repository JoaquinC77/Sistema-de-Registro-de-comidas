package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import model.clases.Encargado;
import model.clases.Pasajero;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class EncargadoWS {

    private String urlWS;

    public EncargadoWS() {
        this.urlWS = "http://localhost:8080";
    }

    public Encargado getEncargadoForId(String parametro) throws MalformedURLException, IOException {
        Encargado encargado = null;

        String rutaCompleta = urlWS + "/encargadoPorId?id=" + parametro;
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
            JsonParser parser = new JsonParser();

            JsonObject jsonObject = (JsonObject) parser.parse(output);

            encargado = new Gson().fromJson(jsonObject, Encargado.class);
        }

        return encargado;
    }
    
    public Encargado getEncargadoForRut(String parametro) throws MalformedURLException, IOException {
        Encargado encargado = null;

        String rutaCompleta = urlWS + "/encargadoPorRut?rut=" + parametro;
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
            JsonParser parser = new JsonParser();

            JsonObject jsonObject = (JsonObject) parser.parse(output);

            encargado = new Gson().fromJson(jsonObject, Encargado.class);
        }

        return encargado;
    }

    public boolean insertEncargado(Encargado en) throws MalformedURLException, IOException {
        //Conversion de parametos a taves de URLEncoder.encode para el paso sin conflictos de variables con espacios
        String parametros = "nombre=" + URLEncoder.encode(en.getNombre(), "UTF-8") + "&rut=" + en.getRut() + "&puesto=" + URLEncoder.encode(en.getPuesto(), "UTF-8") + "&telefono=" + en.getTelefono() + "&email=" + en.getEmail();

        String rutaCompleta = urlWS + "/insertEncargado?" + parametros;

        //http://localhost:8080/insertEncargado?nombre=Encargado3&rut=777-5&puesto=Administrador2&telefono=808080&email=admin3@gmail.com
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
    
    public boolean updateEncargado(Encargado en) throws MalformedURLException, IOException {
        String parametros = "puesto="+en.getPuesto()+"&telefono="+en.getTelefono()+"&email="+en.getEmail()+"&idContra="+en.getId();

        String rutaCompleta = urlWS + "/updateEncargado?" + parametros;

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

    public int getUltimoIdRepresentante() throws MalformedURLException, IOException {
        String rutaCompleta = urlWS + "/ultimoEncargado";
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
        int idUltimoRepre = -1;

        while ((output = br.readLine()) != null) {
            //System.out.println(output);
            Encargado en = new Encargado();

            JsonParser parser = new JsonParser();

            JsonObject jsonObject = (JsonObject) parser.parse(output);

            en = new Gson().fromJson(jsonObject, Encargado.class);

            idUltimoRepre = Integer.parseInt(en.getId());
        }

        return idUltimoRepre;
    }
}
