/*
Chimaltenango, 29 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Ejercicios solucionados con FOR
 */
package I_PARCIAL;
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int opcion;
        
        do{
           System.out.println("---------------------------");
            System.out.println("  EJERCICIOS FOR  ");
            System.out.println("---------------------------");
            System.out.println("1....Numeros del 1 al 50");
            System.out.println("2....Numeros del 50 al 1");
            System.out.println("3....Numeros del 1 al 99 de 3 en 3");
            System.out.println("4....Cuadrado de asteriscos");
            System.out.println("5....Un reloj 1-60seg;1-60m; 1-24h");
            System.out.println("6.... Salir");
            System.out.print("Selecciones su opcion: ");
            opcion=teclado.nextInt();
            
            switch(opcion){
            case 1:{
                    for(int i=0; i<=50; i++){
                        System.out.println(i);
                    }
                    break;
                }//Fin case 1
            case 2:{
                    for(int i=50; i>0; i--){
                        System.out.println(i);
                    }
                    break;
                }//Fin case 2
            case 3:{
                    for(int i=0; i<100; i++){
                        System.out.print(i+" ");
                        i+=2;
                    }
                    break;
                }//Fin case 3
            case 4:{
                int lado=10;
                    for(int i=0; i<lado; i++){
                        for(int j=0; j<lado; j++){
                            if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }//Fin case 4
            case 5:{
                int horas = 1;
                int minutos = 0;

                for (int i = 0; i < 60; i++) {
                    System.out.printf("%02d:%02d\n", horas, minutos);

                    // Simulamos el paso de un minuto
                    minutos++;

                    // Si llegamos a 60 minutos, reiniciamos y aumentamos la hora
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                    }

                    // Si llegamos a 13 horas (1 hora más después de las 12),
                    // reiniciamos a la 1
                    if (horas == 13) {
                        horas = 1;
                    }
                    break; 
                }
            }
                default:{
                    System.out.println("******Por favor seleccione una opción del menú, Gracias!!****");
                    break;
                }//Fin default
            }
        }while (opcion!=6);
    }
}
