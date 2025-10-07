
package pe.company.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ventaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ventaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoBicicleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dniAsesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idVenta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreAsesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreBicicleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stockBicicleta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ventaDTO", propOrder = {
    "codigoBicicleta",
    "dniAsesor",
    "idVenta",
    "nombreAsesor",
    "nombreBicicleta",
    "stockBicicleta"
})
public class VentaDTO {

    protected String codigoBicicleta;
    protected String dniAsesor;
    protected int idVenta;
    protected String nombreAsesor;
    protected String nombreBicicleta;
    protected int stockBicicleta;

    /**
     * Obtiene el valor de la propiedad codigoBicicleta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    /**
     * Define el valor de la propiedad codigoBicicleta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBicicleta(String value) {
        this.codigoBicicleta = value;
    }

    /**
     * Obtiene el valor de la propiedad dniAsesor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDniAsesor() {
        return dniAsesor;
    }

    /**
     * Define el valor de la propiedad dniAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDniAsesor(String value) {
        this.dniAsesor = value;
    }

    /**
     * Obtiene el valor de la propiedad idVenta.
     * 
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Define el valor de la propiedad idVenta.
     * 
     */
    public void setIdVenta(int value) {
        this.idVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAsesor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsesor() {
        return nombreAsesor;
    }

    /**
     * Define el valor de la propiedad nombreAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsesor(String value) {
        this.nombreAsesor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBicicleta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBicicleta() {
        return nombreBicicleta;
    }

    /**
     * Define el valor de la propiedad nombreBicicleta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBicicleta(String value) {
        this.nombreBicicleta = value;
    }

    /**
     * Obtiene el valor de la propiedad stockBicicleta.
     * 
     */
    public int getStockBicicleta() {
        return stockBicicleta;
    }

    /**
     * Define el valor de la propiedad stockBicicleta.
     * 
     */
    public void setStockBicicleta(int value) {
        this.stockBicicleta = value;
    }

}
