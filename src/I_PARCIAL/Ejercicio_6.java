/*
Chimaltenango, 28 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ejercicios sobre estructuras repetitivas
 */
package I_PARCIAL;
import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args){
        System.out.println("Ejemplo de Estructura Repetitivas");
        Scanner teclado=new Scanner(System.in);
        int notasMayoresIgualesA7 = 0;
        int notasMenoresA7 = 0;
        int contador = 1;
        while (contador <= 10) {
            System.out.print("Ingrese la nota del alumno " + contador + ": ");
            int nota = teclado.nextInt();

            if (nota >= 7) {
                notasMayoresIgualesA7++;
            } else {
                notasMenoresA7++;
            }

            contador++;
        }

        System.out.println("Alumnos con notas mayores o iguales a 7: " + notasMayoresIgualesA7);
        System.out.println("Alumnos con notas menores a 7: " + notasMenoresA7);
    }
}
