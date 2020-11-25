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
import model.clases.Empresa;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class EmpresaWS {

    private String urlWS;
    private HttpURLConnection conn;

    public EmpresaWS() {
        this.urlWS = "http://localhost:8080";
    }

    public boolean insertEmpresa(Empresa e) throws MalformedURLException, IOException {
        //Conversion de parametos a taves de URLEncoder.encode para el paso sin conflictos de variables con espacios
        String parametros = "nombre=" + URLEncoder.encode(e.getNombre(), "UTF-8") + "&rut=" + e.getRut() + "&direccion=" + URLEncoder.encode(e.getDireccion(), "UTF-8") + "&idRepre=" + e.getIdRepresentante();

        //Ruta completa del host+parametros a enviar
        String rutaCompleta = urlWS + "/insertEmpresa?" + parametros;

        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");

        //Se establece una conexion a la ruta indicada anteriormente
        conn = (HttpURLConnection) new URL(rutaCompleta).openConnection();
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

            if (output.equals("null")) {
                return false;
            }
            //System.out.println(output);

            boolean ok = Boolean.parseBoolean(output);
            System.out.println(ok);
            return ok;

        }

        return false;
    }

    public boolean updateEmpres(Empresa e) throws MalformedURLException, IOException {
        String parametros = "id=" + e.getId() + "&nombre=" + URLEncoder.encode(e.getNombre(), "UTF-8") + "&direccion=" + URLEncoder.encode(e.getDireccion(), "UTF-8");

        //Ruta completa del host+parametros a enviar
        String rutaCompleta = urlWS + "/updateEmpresa?" + parametros;

        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");

        //Se establece una conexion a la ruta indicada anteriormente
        conn = (HttpURLConnection) new URL(rutaCompleta).openConnection();
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

    public Empresa getEmpresaPorRut(String rut) throws MalformedURLException, IOException {
        Empresa empresa = null;

        String urlWS = this.urlWS + "/getEmpresaRut?rut=" + rut;
        URL url = new URL(urlWS);

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

            if (output.equals("null")) {
                return null;
            }

            JsonParser parser = new JsonParser();

            JsonObject jsonObject = (JsonObject) parser.parse(output);

            empresa = new Gson().fromJson(jsonObject, Empresa.class);
        }

        return empresa;
    }

    public List<Empresa> getAllEmpresas() throws MalformedURLException, IOException {

        List<Empresa> lista = null;

        String urlWS = this.urlWS + "/empresas";
        URL url = new URL(urlWS);

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
            lista = new ArrayList<>();

            System.out.println(jsonLista);

            for (int i = 0; i < jsonLista.size(); i++) {
                JsonObject jsonObject = (JsonObject) jsonLista.get(i);
                Empresa empresa = new Gson().fromJson(jsonObject, Empresa.class);

                lista.add(empresa);
            }
        }

        return lista;
    }

}
