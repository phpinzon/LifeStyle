/*
Chimaltenango, 22 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ejemplo de Estructura Condicional Simple
 */
package I_PARCIAL;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args){
        System.out.println("Ejemplo de Estructura Condicional Simple");
        Scanner teclado=new Scanner(System.in);
        float sueldo;
        System.out.println("Ingrese el sueldo: ");
        sueldo=teclado.nextFloat();
        if (sueldo>3000){
            System.out.println("Esta persona debe abonar impuestos");
        }
        
    }
}
