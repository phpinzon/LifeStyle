/*
Chimaltenango, 22 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ingreso de numeros, calculo y mostrar resultados
 */
package I_PARCIAL;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args){
        System.out.println("Ejemplo de Estructura Secuencial");
        Scanner teclado=new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.println("Ingrese primer valor: ");
        num1=teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2=teclado.nextInt();
        suma=num1 + num2;
        producto=num1 * num2;
        System.out.println("La suma de los dos valores es: ");
        System.out.println(suma);
        System.out.println("El Producto de los dos valores es: ");
        System.out.println(producto);
    }
}
