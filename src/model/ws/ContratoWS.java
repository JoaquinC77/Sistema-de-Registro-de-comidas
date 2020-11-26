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
    private HttpURLConnection conn;

    public ContratoWS() {
        this.urlWs = "http://localhost:8080";
    }

    public String getIdContratoPorIdPasajero(String idPasajero) throws MalformedURLException, IOException {
        String idContrato = "-1";

        String urlWS = this.urlWs + "/getIdContratoPorIdPasajero?idPasaj=" + idPasajero;

        System.out.println(urlWS);
        URL url = new URL(urlWS);

        idContrato = new ConexionWS().getStringResponse(url);
        
        return idContrato;
    }

    public List<Contrato> getContratosForIDEmpresa(String idEmpresa) throws MalformedURLException, IOException {
        List<Contrato> lista = new ArrayList<>();

        String urlWS = this.urlWs + "/contratos?idEmpresa=" + idEmpresa;
        URL url = new URL(urlWS);

        
        JsonArray jsonLista = new ConexionWS().getJsonArray(url);
        
        lista = new ArrayList<>();
        
        for (int i = 0; i < jsonLista.size(); i++) {
            JsonObject jsonObject = (JsonObject) jsonLista.get(i);
            Contrato contrato = new Gson().fromJson(jsonObject, Contrato.class);

            lista.add(contrato);
        }
        return lista;
    }

    public boolean insertContrato(Contrato c) throws IOException, MalformedURLException {
        //insertContrato
        //idEmpresa nombre  idAdmin  fechaInicio  fechaFin  estado

        String parametros = "codigo=" + c.getCodigo() + "&idEmpresa=" + c.getIdEmpresa() + "&nombre=" + URLEncoder.encode(c.getNombre(), "UTF-8") + "&idAdmin=" + c.getIdAdmin() + "&fechaInicio=" + c.getFechaInicio() + "&fechaFin=" + c.getFechaFin() + "&estado=" + c.getEstado();

        String rutaCompleta = urlWs + "/insertContrato?" + parametros;

        boolean response = new ConexionWS().getTrueORFalseResponse(rutaCompleta);
        
        return response;
    }

    public boolean updateContrato(Contrato c) throws IOException, MalformedURLException {

        String parametros = "idContrato=" + c.getId() + "&fechaInicio=" + c.getFechaInicio() + "&fechaFin=" + c.getFechaFin();

        String rutaCompleta = urlWs + "/updateContrato?" + parametros;

        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        
        boolean response = new ConexionWS().getTrueORFalseResponse(rutaCompleta);
        
        return response;
    }

    public Contrato getContratoForId(String idContrato) throws MalformedURLException, IOException {
        Contrato contrato = null;

        String urlWS = this.urlWs + "/contratoPorId?idContrato=" + idContrato;
        URL url = new URL(urlWS);

        JsonObject jsonObject = new ConexionWS().getJsonObject(url);

        contrato = new Gson().fromJson(jsonObject, Contrato.class);

        return contrato;
    }

    public Contrato getContratoForCodigo(String codigo) throws MalformedURLException, IOException {
        Contrato contrato = null;

        String urlWS = this.urlWs + "/contratoPorCodigo?codigo=" + codigo;
        URL url = new URL(urlWS);

        JsonObject jsonObject = new ConexionWS().getJsonObject(url);

        contrato = new Gson().fromJson(jsonObject, Contrato.class);

        return contrato;
    }

}
