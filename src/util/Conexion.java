package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Conexion a Derby
public class Conexion {
    private static final String URL = "jdbc:derby:triageDB;create=true";
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static Connection conexion = null;

    // Conectar a la BD
    public static Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName(DRIVER);
                conexion = DriverManager.getConnection(URL);
                System.out.println("Conexión exitosa a la base de datos Derby");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Driver no encontrado - " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos - " + e.getMessage());
        }
        return conexion;
    }

    // Cerrar conexion
    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión - " + e.getMessage());
        }
    }
}
