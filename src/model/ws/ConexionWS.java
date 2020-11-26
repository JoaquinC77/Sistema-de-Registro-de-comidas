/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Encargado;
import model.clases.Pasajero;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class ConexionWS {

    private URL url;
    private HttpURLConnection conn;

    public ConexionWS() {
    }

    public JsonObject getJsonObject(URL url) throws IOException {
        conn = (HttpURLConnection) url.openConnection();
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
            System.out.println(jsonObject);

            return jsonObject;

        }

        return null;
    }

    public JsonArray getJsonArray(URL url) throws IOException {
        conn = (HttpURLConnection) url.openConnection();
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

            JsonArray jsonLista = parser.parse(output).getAsJsonArray();

            System.out.println(jsonLista);

            return jsonLista;
        }

        return null;
    }

    public boolean getTrueORFalseResponse(String ruta) throws MalformedURLException, IOException {
        conn = (HttpURLConnection) new URL(ruta).openConnection();
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

    public String getStringResponse(URL url) throws IOException {
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : "
                    + conn.getResponseCode());
        }
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;
        
        String response = null;

        while ((output = br.readLine()) != null) {
            //System.out.println(output);
            response = output;
        }

        return response;
    }

}
