package pe.company.dbase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDb {

    public static Connection getConexion() {
        Connection con = null;
        try {
            // Cargar el driver (sin usar .newInstance(), que está deprecated)
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost/dbbicicleta?useSSL=false&useTimezone=true&serverTimezone=UTC";
            String usr = "root";
            String psw = ""; // tu contraseña si tu MySQL tiene una

            con = DriverManager.getConnection(url, usr, psw);

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: Driver JDBC de MySQL no encontrado -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Error general -> " + e.getMessage());
        }
        return con;
    }
}
