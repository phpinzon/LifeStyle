/*
Chimaltenango, 05 de agosto 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ejemplo de lectura en un fichero(archivo)
 */
package I_PARCIAL;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
public static void main(String[] args) {
 
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