package clientesoap;

import pe.company.services.VentaService;
import pe.company.services.VentaService_Service;
import pe.company.services.VentaDTO;
import java.util.List;

public class ClienteSOAP {
    public static void main(String[] args) {

        // Instanciar el servicio y obtener el puerto (endpoint)
        VentaService_Service servicio = new VentaService_Service();
        VentaService port = servicio.getVentaServicePort();

        System.out.println("=== LISTADO DE VENTAS ===");

        // Llamar al método del servicio
        List<VentaDTO> lista = port.listarVentas();

        // Recorrer y mostrar resultados
        for (VentaDTO v : lista) {
            System.out.println("----------------------------");
            System.out.println("ID Venta: " + v.getIdVenta());
            System.out.println("Nombre Asesor: " + v.getNombreAsesor());
            System.out.println("DNI Asesor: " + v.getDniAsesor());
            System.out.println("Código Bicicleta: " + v.getCodigoBici());
            System.out.println("Nombre Bicicleta: " + v.getNombreBici());
            System.out.println("Stock: " + v.getStock());
        }
    }
}
