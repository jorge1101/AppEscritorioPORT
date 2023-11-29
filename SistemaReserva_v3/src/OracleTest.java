
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleTest {

    private Connection conexion;

    public OracleTest() {
        try {
            // Establecer la conexión a la base de datos Oracle en localhost con puerto 1521 y SID XE
            String url = "jdbc:oracle:thin:@localhost:1521/XE";
            String usuario = "Portafolio";
            String contraseña = "duoc";
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo conectar a la base de datos Oracle.");
        }
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void obtenerClientes() {
        String sql = "SELECT rut_cliente, correo, sexo, telefono_cliente, nombre_cliente FROM CLIENTE";

        try (PreparedStatement statement = conexion.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String rut = resultSet.getString("rut_cliente");
                String correo = resultSet.getString("correo");
                String sexo = resultSet.getString("sexo");
                String telefono = resultSet.getString("telefono_cliente");
                String nombre = resultSet.getString("nombre_cliente");

                // Hacer algo con los datos obtenidos, como imprimirlos
                System.out.println("Rut: " + rut);
                System.out.println("Correo: " + correo);
                System.out.println("Sexo: " + sexo);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Nombre: " + nombre);
                System.out.println("--------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener los clientes de la base de datos.");
        }
    }
    
    public void obtenerComunas() {
    String sql = "SELECT id_comuna, nombre_comuna FROM COMUNA";

    try (PreparedStatement statement = conexion.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            int idComuna = resultSet.getInt("id_comuna");
            String nombreComuna = resultSet.getString("nombre_comuna");

            // Hacer algo con los datos obtenidos, como imprimirlos
            System.out.println("ID Comuna: " + idComuna);
            System.out.println("Nombre Comuna: " + nombreComuna);
            System.out.println("--------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new RuntimeException("Error al obtener las comunas de la base de datos.");
    }
}
    
    public void obtenerRegiones() {
    String sql = "SELECT id_region, nombre_region FROM REGION";

    try (PreparedStatement statement = conexion.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            int idRegion = resultSet.getInt("id_region");
            String nombreRegion = resultSet.getString("nombre_region");

            // Hacer algo con los datos obtenidos, como imprimirlos
            System.out.println("ID Región: " + idRegion);
            System.out.println("Nombre Región: " + nombreRegion);
            System.out.println("--------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new RuntimeException("Error al obtener las regiones de la base de datos.");
    }
}
    
    public void obtenerTrabajadores() {
    String sql = "SELECT id_trabajador, rut_trabajador, dv_trabajador, numero_trabajador, correo_trabajador, estado_trabajador FROM TRABAJADORES";

    try (PreparedStatement statement = conexion.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            int idTrabajador = resultSet.getInt("id_trabajador");
            String rutTrabajador = resultSet.getString("rut_trabajador");
            char dvTrabajador = resultSet.getString("dv_trabajador").charAt(0); // Obtener el primer carácter del DV.
            int numeroTrabajador = resultSet.getInt("numero_trabajador");
            String correoTrabajador = resultSet.getString("correo_trabajador");
            String estadoTrabajador = resultSet.getString("estado_trabajador");

            // Hacer algo con los datos obtenidos, como imprimirlos
            System.out.println("ID Trabajador: " + idTrabajador);
            System.out.println("RUT Trabajador: " + rutTrabajador + "-" + dvTrabajador);
            System.out.println("Número Trabajador: " + numeroTrabajador);
            System.out.println("Correo Trabajador: " + correoTrabajador);
            System.out.println("Estado Trabajador: " + estadoTrabajador);
            System.out.println("--------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new RuntimeException("Error al obtener los trabajadores de la base de datos.");
    }
}

    public void obtenerCredenciales() {
    String sql = "SELECT id_tipouser, tipo_usuario, nombre_usuario, contraseña, correo_recuperacion FROM CREDENCIALES_USUARIOS";

    try (PreparedStatement statement = conexion.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            int idTipoUser = resultSet.getInt("id_tipouser");
            String tipoUsuario = resultSet.getString("tipo_usuario");
            String nombreUsuario = resultSet.getString("nombre_usuario");
            String contraseña = resultSet.getString("contraseña");
            String correoRecuperacion = resultSet.getString("correo_recuperacion");

            // Hacer algo con los datos obtenidos, como imprimirlos
            System.out.println("ID Tipo Usuario: " + idTipoUser);
            System.out.println("Tipo Usuario: " + tipoUsuario);
            System.out.println("Nombre Usuario: " + nombreUsuario);
            System.out.println("Contraseña: " + contraseña);
            System.out.println("Correo Recuperación: " + correoRecuperacion);
            System.out.println("--------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new RuntimeException("Error al obtener las credenciales de la base de datos.");
    }
}

    
    public void obtenerDepartamentos() {
    String sql = "SELECT id_departamento, nro_arrendado, fotos_cabania, servicio_asociado, descripcion_cabania FROM DEPARTAMENTO";

    try (PreparedStatement statement = conexion.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            int idDepartamento = resultSet.getInt("id_departamento");
            int nroArrendado = resultSet.getInt("nro_arrendado");
            String fotosCabania = resultSet.getString("fotos_cabania");
            String servicioAsociado = resultSet.getString("servicio_asociado");
            String descripcionCabania = resultSet.getString("descripcion_cabania");

            // Hacer algo con los datos obtenidos, como imprimirlos
            System.out.println("ID Departamento: " + idDepartamento);
            System.out.println("Número Arrendado: " + nroArrendado);
            System.out.println("Fotos Cabaña: " + fotosCabania);
            System.out.println("Servicio Asociado: " + servicioAsociado);
            System.out.println("Descripción Cabaña: " + descripcionCabania);
            System.out.println("--------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new RuntimeException("Error al obtener los departamentos de la base de datos.");
    }
}

    public static void main(String[] args) {
        OracleTest OracleTest = new OracleTest();
        OracleTest.obtenerClientes();
        OracleTest.obtenerComunas();
        OracleTest.obtenerRegiones();
        OracleTest.obtenerTrabajadores();
        OracleTest.obtenerCredenciales();
        OracleTest.obtenerDepartamentos();
        OracleTest.cerrarConexion();
    }
}
