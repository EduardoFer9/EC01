package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe.company.dbase.ConexionDb;
import pe.company.vo.ventavo;

public class ventadao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public ventadao() {
    }

    // --- Método para listar todas las ventas ---
    public Collection<ventavo> findAll() {
        List<ventavo> list = new ArrayList<>();

        try {
            conn = ConexionDb.getConexion();
            ps = conn.prepareStatement(
                "SELECT v.idVenta, a.nombre AS nombreAsesor, a.dni AS dniAsesor, " +
                "b.codigoBici, b.nombreBici, b.stock " +
                "FROM tb_venta v " +
                "INNER JOIN tb_asesor a ON v.idAsesor = a.idAsesor " +
                "INNER JOIN tb_bicicleta b ON v.idBici = b.idBici"
            );

            rs = ps.executeQuery();

            while (rs.next()) {
                ventavo venta = new ventavo();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setNombreAsesor(rs.getString("nombreAsesor"));
                venta.setDniAsesor(rs.getString("dniAsesor"));
                venta.setCodigoBici(rs.getString("codigoBici"));
                venta.setNombreBici(rs.getString("nombreBici"));
                venta.setStock(rs.getInt("stock"));
                list.add(venta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
