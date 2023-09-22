/*
Chimaltenango, 28 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ejercicios sobre estructuras repetitivas
 */
package I_PARCIAL;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args){
        System.out.println("Ejemplo de Estructura Repetitivas");
        Scanner teclado=new Scanner(System.in);
        int num, multiplicacion;
        num=5;
        for(int i=0; i<=10; i++){
            multiplicacion=num*i;
            System.out.println("5*"+i+" = "+multiplicacion);
        }
    }
}
