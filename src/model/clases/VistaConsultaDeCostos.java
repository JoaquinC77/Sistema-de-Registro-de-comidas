package model.clases;

/**
 *
 * @author Santo Tomás
 */
public class VistaConsultaDeCostos {
    private String idEmpresa;
    private String idContrato;
    private String fechaInicio;
    private String fechaFin;
    private int cantidadTrabajadores;
    private int cantidadDesayunosServidos;
    private int valorDesayuno;
    private int totalDesayuno;
    private int cantidadAlmuerzoServidos;
    private int valorAlmuerzo;
    private int totalAlmuerzo;
    private int cantidadCenasServidas;
    private int valorCena;
    private int totalCenas;
    private int totalDeServiciosServidos;
    private int total;

    public VistaConsultaDeCostos(String idEmpresa, String idContrato, String fechaInicio, String fechaFin, int cantidadTrabajadores, int cantidadDesayunosServidos, int valorDesayuno, int totalDesayuno, int cantidadAlmuerzoServidos, int valorAlmuerzo, int totalAlmuerzo, int cantidadCenasServidas, int valorCena, int totalCenas, int totalDeServiciosServidos, int total) {
        this.idEmpresa = idEmpresa;
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.cantidadDesayunosServidos = cantidadDesayunosServidos;
        this.valorDesayuno = valorDesayuno;
        this.totalDesayuno = totalDesayuno;
        this.cantidadAlmuerzoServidos = cantidadAlmuerzoServidos;
        this.valorAlmuerzo = valorAlmuerzo;
        this.totalAlmuerzo = totalAlmuerzo;
        this.cantidadCenasServidas = cantidadCenasServidas;
        this.valorCena = valorCena;
        this.totalCenas = totalCenas;
        this.totalDeServiciosServidos = totalDeServiciosServidos;
        this.total = total;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public int getCantidadDesayunosServidos() {
        return cantidadDesayunosServidos;
    }

    public void setCantidadDesayunosServidos(int cantidadDesayunosServidos) {
        this.cantidadDesayunosServidos = cantidadDesayunosServidos;
    }

    public int getValorDesayuno() {
        return valorDesayuno;
    }

    public void setValorDesayuno(int valorDesayuno) {
        this.valorDesayuno = valorDesayuno;
    }

    public int getTotalDesayuno() {
        return totalDesayuno;
    }

    public void setTotalDesayuno(int totalDesayuno) {
        this.totalDesayuno = totalDesayuno;
    }

    public int getCantidadAlmuerzoServidos() {
        return cantidadAlmuerzoServidos;
    }

    public void setCantidadAlmuerzoServidos(int cantidadAlmuerzoServidos) {
        this.cantidadAlmuerzoServidos = cantidadAlmuerzoServidos;
    }

    public int getValorAlmuerzo() {
        return valorAlmuerzo;
    }

    public void setValorAlmuerzo(int valorAlmuerzo) {
        this.valorAlmuerzo = valorAlmuerzo;
    }

    public int getTotalAlmuerzo() {
        return totalAlmuerzo;
    }

    public void setTotalAlmuerzo(int totalAlmuerzo) {
        this.totalAlmuerzo = totalAlmuerzo;
    }

    public int getCantidadCenasServidas() {
        return cantidadCenasServidas;
    }

    public void setCantidadCenasServidas(int cantidadCenasServidas) {
        this.cantidadCenasServidas = cantidadCenasServidas;
    }

    public int getValorCena() {
        return valorCena;
    }

    public void setValorCena(int valorCena) {
        this.valorCena = valorCena;
    }

    public int getTotalCenas() {
        return totalCenas;
    }

    public void setTotalCenas(int totalCenas) {
        this.totalCenas = totalCenas;
    }

    public int getTotalDeServiciosServidos() {
        return totalDeServiciosServidos;
    }

    public void setTotalDeServiciosServidos(int totalDeServiciosServidos) {
        this.totalDeServiciosServidos = totalDeServiciosServidos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}
