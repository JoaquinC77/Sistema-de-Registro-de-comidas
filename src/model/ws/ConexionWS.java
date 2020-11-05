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

    private String urlWS;
    private URL url;

    public ConexionWS() {
        this.urlWS = "http://localhost:8080";
    }

    /*
    try {
            String urlWS = "http://localhost:8080/empresas";
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
                //System.out.println(output);
                JsonParser parser = new JsonParser();

                JsonArray jsonLista = parser.parse(output).getAsJsonArray();
                lista = new ArrayList<>();

                System.out.println(jsonLista);

                for (int i = 0; i < jsonLista.size(); i++) {
                    JsonObject jsonObject = (JsonObject) jsonLista.get(i);
                    Empresa empresa = new Gson().fromJson(jsonObject, Empresa.class);

                    lista.add(empresa);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error de servidor");
        }
     */
}
