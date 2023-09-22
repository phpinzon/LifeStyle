/*
Chimaltenango, 05 de agosto 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ejemplo de lectura y escritura en un fichero(archivo)
 */
package I_PARCIAL;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class MiNegocio {
    public static void main(String[] args){
    Scanner Entrada = new Scanner(System.in);
    int opcion;
    
    do{
    System.out.println("---------------");
    System.out.println("  MI NEGOCIO   ");
    System.out.println("---------------");
    System.out.println("1....Ingresar Datos");
    System.out.println("2....Mostrar Datos");
    System.out.println("3....Salir");
    opcion=Entrada.nextInt();
    
    switch(opcion){
        case 1:{
            String cadena;
  
        try (FileWriter fw = new FileWriter("c:/ficheros/datos.txt", true);
            PrintWriter salida = new PrintWriter(fw)) {   
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = Entrada.nextLine();                             //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         //se escribe la cadena en el fichero
                cadena = Entrada.nextLine();                         //se introduce por teclado una cadena de texto    
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());                                                                  
        } 
            break;
        }
        
        case 2:{
            FileReader fr = null;
  
        try {
            fr = new FileReader("c:/ficheros/datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) {               //mientras no se llegue al final del fichero                   
                System.out.println(cadena);        //se muestra por pantalla
                cadena = entrada.readLine();       //se lee la siguiente línea del fichero                        
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
        }
    }

} while (opcion!=3);
    
}
}