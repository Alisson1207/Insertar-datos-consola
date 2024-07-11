import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/estudiante";
        String user = "root";
        String password = "123456789";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cedula del estudiante: ");
        String cedula = sc.nextLine();
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la nota del b1 del estudiante: ");
        double b1 = sc.nextDouble();
        System.out.println("Ingrese la nota del b2 del estudiante: ");
        double b2 = sc.nextDouble();

        Estudiante est = new Estudiante(cedula, nombre, b1, b2);
        //Insertar datos
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            String sql = "INSERT INTO estudiantes (cedula,nombre,b1,b2) VALUES (?,?,?,?)";
            PreparedStatement cadena = connection.prepareStatement(sql);
            cadena.setString(1, cedula);
            cadena.setString(2, nombre);
            cadena.setDouble(3, b1);
            cadena.setDouble(4, b2);
            System.out.println("Datos Insertados Correctamente");
            cadena.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();

        }
    }
}