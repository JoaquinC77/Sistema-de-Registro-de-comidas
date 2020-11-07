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
import model.clases.Contrato;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class ContratoWS {

    private String urlWs;

    public ContratoWS() {
        this.urlWs = "http://localhost:8080";
    }

    public String getIdContratoPorIdPasajero(String idPasajero) throws MalformedURLException, IOException {
        String idContrato = "-1";

        String urlWS = this.urlWs + "/getIdContratoPorIdPasajero?idPasaj=" + idPasajero;

        System.out.println(urlWS);
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
            idContrato = output;
        }

        return idContrato;
    }

    public List<Contrato> getContratosForIDEmpresa(String idEmpresa) throws MalformedURLException, IOException {
        List<Contrato> lista = new ArrayList<>();

        String urlWS = this.urlWs + "/contratos?idEmpresa=" + idEmpresa;
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
                Contrato contrato = new Gson().fromJson(jsonObject, Contrato.class);

                lista.add(contrato);
            }
        }

        return lista;
    }

    public boolean insertContrato(Contrato c) throws IOException, MalformedURLException {
        //insertContrato
        //idEmpresa nombre  idAdmin  fechaInicio  fechaFin  estado

        String parametros = "codigo=" + c.getCodigo() + "&idEmpresa=" + c.getIdEmpresa() + "&nombre=" + URLEncoder.encode(c.getNombre(), "UTF-8") + "&idAdmin=" + c.getIdAdmin() + "&fechaInicio=" + c.getFechaInicio() + "&fechaFin=" + c.getFechaFin() + "&estado=" + c.getEstado();

        String rutaCompleta = urlWs + "/insertContrato?" + parametros;

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

    public Contrato getContratoForId(String idContrato) throws MalformedURLException, IOException {
        Contrato contrato = null;

        String urlWS = this.urlWs + "/contratoPorId?idContrato=" + idContrato;
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
            

            System.out.println(jsonLista);

            for (int i = 0; i < jsonLista.size(); i++) {
                JsonObject jsonObject = (JsonObject) jsonLista.get(i);
                contrato = new Gson().fromJson(jsonObject, Contrato.class);
            }
        }

        return contrato;
    }
    
      public Contrato getContratoForCodigo(String codigo) throws MalformedURLException, IOException {
        Contrato contrato = null;

        String urlWS = this.urlWs + "/contratoPorCodigo?codigo=" + codigo;
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


            JsonObject jsonObject2 = (JsonObject) parser.parse(output);
            contrato = new Gson().fromJson(jsonObject2, Contrato.class);

            System.out.println(jsonObject2);

        }

        return contrato;
    }

}
