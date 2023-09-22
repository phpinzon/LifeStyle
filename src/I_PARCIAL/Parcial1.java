/*
Chimaltenango, 12 de agosto 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Inventario de productos usando ficheros
 */
package I_PARCIAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Parcial1 {

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

    public static void leerDatos() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pedro\\OneDrive\\Documentos\\Universidad\\Cuarto Semestre\\Programación II\\Projectos Java\\PPIIA\\src\\I_PARCIAL\\Inventarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void orden(List<String> lineas) {
    Collections.sort(lineas, (linea1, linea2) -> {
        String[] partes1 = linea1.split("\\s+");
        String[] partes2 = linea2.split("\\s+");

        float calificacion1 = Float.parseFloat(partes1[4].trim());
        float calificacion2 = Float.parseFloat(partes2[4].trim());

        return Float.compare(calificacion2, calificacion1); // Orden descendente
    });
}

    
    public static void leerDatos(List<String> lineas) {
    for (int i = 0; i < lineas.size(); i++) {
    String linea = lineas.get(i);
    System.out.println(linea);
}
}




    public static void ingreso() {
    Scanner sc = new Scanner(System.in);
    int codigo;
    float nuevoPrecio;
    int nuevaCantidad;

    System.out.println("Ingrese el código del producto: ");
    codigo = sc.nextInt();
    sc.nextLine(); // Consumir el salto de línea pendiente

    // Crear una lista para almacenar los datos
    List<String> lineasModificadas = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pedro\\OneDrive\\Documentos\\Universidad\\Cuarto Semestre\\Programación II\\Projectos Java\\PPIIA\\src\\I_PARCIAL\\Inventarios.txt"))) {

        String linea;
        boolean encontrado = false;

        while ((linea = br.readLine()) != null) {
            // Leer y procesar cada línea del archivo de inventario
            // Dividir la línea en partes utilizando espacios en blanco como separador
            // Extraer el código del producto de la primera parte de la línea para su procesamiento
            String[] partes = linea.split("\\s+");
            int codigoExistente = Integer.parseInt(partes[0].trim());

            if (codigoExistente == codigo) {
                encontrado = true;
                System.out.println("Producto encontrado:");
                System.out.println(linea);
                System.out.println("Ingrese cantidad: ");
                nuevaCantidad = sc.nextInt();
                System.out.println("Ingrese precio unitario: ");
                nuevoPrecio = sc.nextFloat();

                float nuevoTotal = nuevaCantidad * nuevoPrecio;

                // Modificar la línea y agregarla a la lista
                String nuevaLinea = String.format("%-10d %-20s %-10d %-15.2f %-15.2f", codigoExistente, partes[1], nuevaCantidad, nuevoPrecio, nuevoTotal);
                lineasModificadas.add(nuevaLinea);
            } else {
                lineasModificadas.add(linea);
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }

    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }

    // Reescribir el archivo completo con las líneas modificadas
    try (PrintWriter salida = new PrintWriter(new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\Universidad\\Cuarto Semestre\\Programación II\\Projectos Java\\PPIIA\\src\\I_PARCIAL\\Inventarios.txt"))) {
        lineasModificadas.forEach((lineaModificada) -> {
            salida.println(lineaModificada);
        });
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
}

    public static void extraccion() {
    Scanner sc = new Scanner(System.in);
    int codigo;
    int cantidadAEliminar;

    System.out.println("Ingrese el código del producto: ");
    codigo = sc.nextInt();
    sc.nextLine(); // Consumir el salto de línea pendiente

    // Crear una lista para almacenar los datos
    List<String> lineasModificadas = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pedro\\OneDrive\\Documentos\\Universidad\\Cuarto Semestre\\Programación II\\Projectos Java\\PPIIA\\src\\I_PARCIAL\\Inventarios.txt"))) {

        String linea;
        boolean encontrado = false;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("\\s+");
            int codigoExistente = Integer.parseInt(partes[0].trim());

            if (codigoExistente == codigo) {
                encontrado = true;
                int existenciaActual = Integer.parseInt(partes[2].trim());

                System.out.println("Producto encontrado:");
                System.out.println(linea);
                System.out.println("Ingrese la cantidad a eliminar: ");
                cantidadAEliminar = sc.nextInt();

                if (cantidadAEliminar <= existenciaActual) {
                // Calcular la nueva existencia y el nuevo total
                    int nuevaExistencia = existenciaActual - cantidadAEliminar;
                    float precioUnitario = Float.parseFloat(partes[3].trim());
                    float nuevoTotal = nuevaExistencia * precioUnitario;

                    // Crear una nueva línea con la existencia y el total actualizados
                    String nuevaLinea = String.format("%-10d %-20s %-10d %-15.2f %-15.2f",
                    codigoExistente, partes[1], nuevaExistencia, precioUnitario, nuevoTotal);
                    lineasModificadas.add(nuevaLinea);
                } else {
                        System.out.println("La cantidad a eliminar es mayor que la existencia actual.");
                        lineasModificadas.add(linea); // Mantener la línea original en el archivo
                    }
                
            } else {
                lineasModificadas.add(linea);
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }

    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }

    // Reescribir el archivo completo con las líneas modificadas
    try (PrintWriter salida = new PrintWriter(new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\Universidad\\Cuarto Semestre\\Programación II\\Projectos Java\\PPIIA\\src\\I_PARCIAL\\Inventarios.txt"))) {
        lineasModificadas.forEach((lineaModificada) -> {
            salida.println(lineaModificada);
        });
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
}


    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        List<String> inventario = new ArrayList<>();


        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar producto");
            System.out.println("2. Leer datos");
            System.out.println("3. Ordenar los datos segun popularidad");
            System.out.println("4. Ingresar datos");
            System.out.println("5. Extraer producto");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registro();
                    break;
                case 2:
                    System.out.println("Datos en el inventario:");
                    leerDatos();
                    break;
                case 3:
                    {
                    orden(inventario); // Llamada al método para ordenar
                    System.out.println("Datos del inventario: ");
                    leerDatos(inventario);
                    break;
            }
                case 4:
                    ingreso();
                    break;
                case 5:
                    extraccion();
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
