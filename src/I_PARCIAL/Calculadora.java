/*
Chimaltenango, 29 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Descripción del programa: Calculadora
 */
package I_PARCIAL;
import java.util.Scanner; 
public class Calculadora {
    public static void main(String[] args){
        int opcion;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.println("*****Calculadora*****");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Division");
            System.out.println("5. Seleccione su opcion: ");
            opcion=teclado.nextInt();
            
            switch(opcion){
        case 1: {
            System.out.println("Suma");
            float a, b, c;
            System.out.println("Ingrese primer nuemero");
            a=teclado.nextFloat();
            while (a<=0){
                System.out.println("[ERROR]Ingrese primer nuemero");
                a=teclado.nextFloat();
            }
            System.out.println("Ingrese segundo nuemero");
            b=teclado.nextFloat();
            while (b<=0){
                System.out.println("[ERROR]Ingrese primer nuemero");
                a=teclado.nextFloat();
            }
            c=a+b;
            System.out.println("La suma es: "+ c);
            break;
        }//fin case 1
        case 2: {
            System.out.println("Resta");
            float a, b, c;
            System.out.println("Ingrese primer nuemero");
            a=teclado.nextFloat();
            while (a<=0){
                System.out.println("[ERROR]Ingrese primer nuemero");
                a=teclado.nextFloat();
            }
            System.out.println("Ingrese segundo nuemero");
            b=teclado.nextFloat();
            while (b<=0){
                System.out.println("[ERROR]Ingrese segundo nuemero");
                b=teclado.nextFloat();
            }
            c=a-b;
            System.out.println("La resta es: "+ c);
            break;
        }//fin case2
        
        case 3: {
            System.out.println("Producto");
            float a, b, c;
            System.out.println("Ingrese primer nuemero");
            a=teclado.nextFloat();
            while (a<=0){
                System.out.println("[ERROR]Ingrese primer nuemero");
                a=teclado.nextFloat();
            }
            System.out.println("Ingrese segundo nuemero");
            b=teclado.nextFloat();
            while (b<=0){
                System.out.println("[ERROR]Ingrese segundo nuemero");
                b=teclado.nextFloat();
            }
            c=a*b;
            System.out.println("El producto es: "+ c);
            break;
        }//Fin case 3
        
        case 4: {
            System.out.println("Division");
            float a, b, c;
            System.out.println("Ingrese primer nuemero");
            a=teclado.nextFloat();
            while (a<=0){
                System.out.println("[ERROR]Ingrese primer nuemero");
                a=teclado.nextFloat();
            }
            System.out.println("Ingrese segundo nuemero");
            b=teclado.nextFloat();
            while (b<=0){
               System.out.println("[ERROR]Ingrese segundo nuemero");
                b=teclado.nextFloat(); 
            }
            c=a/b;
            System.out.println("La division es: "+ c);
            break;
        }
        }//fin switch
        }while(opcion!=5);
    }
}

