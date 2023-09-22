package I_PARCIAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ejemplo {

    public static void registro() {
        Scanner sc = new Scanner(System.in);
        int codigo;
        String nombre;
        float calificacion;

        System.out.println("Ingrese el código de producto: ");
        codigo = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el nombre del producto: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese la calificación (1-5): ");
        calificacion = sc.nextFloat();

        try (FileWriter fw = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\Universidad\\Cuarto Semestre\\Programación II\\Projectos Java\\PPIIA\\src\\I_PARCIAL\\Inventarios.txt", true);
             PrintWriter salida = new PrintWriter(fw)) {

            // Formatear y escribir los datos en columnas
            String datosFormateados = String.format("%-10d %-20s %-10d %-15.2f %-15.2f", codigo, nombre, 0, 0.0, calificacion, 0.0);
            salida.println(datosFormateados);

            System.out.println("Producto registrado con éxito.");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // ... (otros métodos como leerDatos, ingreso, extraccion, etc.)

    public static void ordenarPorCalificacion(List<String> lineas) {
        Collections.sort(lineas, (String linea1, String linea2) -> {
            float calificacion1 = Float.parseFloat(linea1.split("\\s+")[4].trim());
            float calificacion2 = Float.parseFloat(linea2.split("\\s+")[4].trim());
            return Float.compare(calificacion2, calificacion1); // Orden descendente
        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar producto");
            System.out.println("2. Leer datos");
            System.out.println("3. Ingresar datos");
            System.out.println("4. Extraer producto");
            System.out.println("5. Ordenar por calificación");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registro();
                    break;
                
               
               
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
}