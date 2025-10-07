/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.vo;

/**
 *
 * @author Oscar
 */
public class ventavo {
    
    private int idVenta;
    private String nombreAsesor;
    private String dniAsesor;
    private String codigoBici;
    private String nombreBici;
    private int stock;

    public ventavo() {
    }

    public ventavo(int idVenta, String nombreAsesor, String dniAsesor, String codigoBici, String nombreBici, int stock) {
        this.idVenta = idVenta;
        this.nombreAsesor = nombreAsesor;
        this.dniAsesor = dniAsesor;
        this.codigoBici = codigoBici;
        this.nombreBici = nombreBici;
        this.stock = stock;
    }

    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNombreAsesor() {
        return nombreAsesor;
    }

    public void setNombreAsesor(String nombreAsesor) {
        this.nombreAsesor = nombreAsesor;
    }

    public String getDniAsesor() {
        return dniAsesor;
    }

    public void setDniAsesor(String dniAsesor) {
        this.dniAsesor = dniAsesor;
    }

    public String getCodigoBici() {
        return codigoBici;
    }

    public void setCodigoBici(String codigoBici) {
        this.codigoBici = codigoBici;
    }

    public String getNombreBici() {
        return nombreBici;
    }

    public void setNombreBici(String nombreBici) {
        this.nombreBici = nombreBici;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}

