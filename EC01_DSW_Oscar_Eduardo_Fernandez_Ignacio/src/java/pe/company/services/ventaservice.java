package pe.company.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pe.company.dbase.ConexionDb;

@WebService(serviceName = "VentaService")
public class ventaservice {

    @WebMethod(operationName = "listarVentas")
    public List<ventaDTO> listarVentas() {
        List<ventaDTO> lista = new ArrayList<>();

        try (Connection con = ConexionDb.getConexion()) {
            String sql = """
                SELECT v.idVenta,
                       a.nombre AS nombreAsesor,
                       a.dni AS dniAsesor,
                       b.codigoBici AS codigoBicicleta,
                       b.nombreBici AS nombreBicicleta,
                       b.stock AS stockBicicleta
                FROM tb_venta v
                INNER JOIN tb_asesor a ON v.idAsesor = a.idAsesor
                INNER JOIN tb_bicicleta b ON v.idBici = b.idBici
            """;

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ventaDTO dto = new ventaDTO();
                dto.setIdVenta(rs.getInt("idVenta"));
                dto.setNombreAsesor(rs.getString("nombreAsesor"));
                dto.setDniAsesor(rs.getString("dniAsesor"));
                dto.setCodigoBicicleta(rs.getString("codigoBicicleta"));
                dto.setNombreBicicleta(rs.getString("nombreBicicleta"));
                dto.setStockBicicleta(rs.getInt("stockBicicleta"));
                lista.add(dto);
            }

        } catch (Exception e) {
            System.out.println("Error al listar ventas: " + e.getMessage());
        }

        return lista;
    }
}
