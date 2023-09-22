/*
Chimaltenango, 28 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ejercicios sobre estructuras repetitivas
 */
package I_PARCIAL;
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args){
        System.out.println("Ejemplo de Estructura Repetitivas");
        Scanner teclado=new Scanner(System.in);
        int suma = 0;
        int cantidadNumeros = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = teclado.nextInt();

            if (numero != 0) {
                suma += numero;
                cantidadNumeros++;
            }

        } while (numero != 0);

        if (cantidadNumeros > 0) {
            double promedio = (double) suma / cantidadNumeros;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números para calcular el promedio.");
        }
    }
}
