package pe.company.services;

public class ventaDTO {
    private int idVenta;
    private String nombreAsesor;
    private String dniAsesor;
    private String codigoBicicleta;
    private String nombreBicicleta;
    private int stockBicicleta;

    // Getters y setters
    public int getIdVenta() { return idVenta; }
    public void setIdVenta(int idVenta) { this.idVenta = idVenta; }

    public String getNombreAsesor() { return nombreAsesor; }
    public void setNombreAsesor(String nombreAsesor) { this.nombreAsesor = nombreAsesor; }

    public String getDniAsesor() { return dniAsesor; }
    public void setDniAsesor(String dniAsesor) { this.dniAsesor = dniAsesor; }

    public String getCodigoBicicleta() { return codigoBicicleta; }
    public void setCodigoBicicleta(String codigoBicicleta) { this.codigoBicicleta = codigoBicicleta; }

    public String getNombreBicicleta() { return nombreBicicleta; }
    public void setNombreBicicleta(String nombreBicicleta) { this.nombreBicicleta = nombreBicicleta; }

    public int getStockBicicleta() { return stockBicicleta; }
    public void setStockBicicleta(int stockBicicleta) { this.stockBicicleta = stockBicicleta; }
}
