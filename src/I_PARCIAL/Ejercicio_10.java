/*
Chimaltenango, 29 de julio 2023
Programador: Pedro Samuel Hernández Pinzón
Ejemplo de Calculadora usando bucles(ciclos)y METODOS
 */
package I_PARCIAL;
import java.util.Scanner;
public class Ejercicio_10 {
    //Metodo Sumar 1
public void Sumar(){
    Scanner Entrada = new Scanner(System.in);
       float a,b,c;
       System.out.println("***************************");
       System.out.println("      Operación Suma       ");
       System.out.println("***************************");
       System.out.print("Ingrese primer valor: ");
       a=Entrada.nextFloat();
       System.out.print("Ingrese segundo valor: ");
       b=Entrada.nextFloat();
       c=a+b;
       System.out.println("El resultado de la suma es: "+c);           
}

public void Restar(){
    Scanner Entrada = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("      Operación Resta      ");
        System.out.println("***************************");
        float a,b,c;
        System.out.print("Ingrese primer valor: ");
        a=Entrada.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        b=Entrada.nextFloat();
        c=a-b;
        System.out.println("El resultado de la resta es: "+c);
}

public void Multiplicar(){
    Scanner Entrada = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println(" Operación Multiplicación  ");
        System.out.println("***************************");
        float a,b,c;
        System.out.print("Ingrese primer valor: ");
        a=Entrada.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        b=Entrada.nextFloat();
        c=a*b;
        System.out.println("El resultado de la multiplicacion es: "+c);
}

public void Division(){
    Scanner Entrada = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("     Operación División    ");
        System.out.println("***************************");
        float a,b,c;
        System.out.print("Ingrese primer valor: ");
        a=Entrada.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        b=Entrada.nextFloat();
        while (b<=0){
            System.out.print("[ERROR] Ingrese segundo valor: ");
            b=Entrada.nextFloat();
        }
        c=a/b;
        System.out.println("El resultado de la division es: "+c);
}
//Metodo main()
public static void main(String[] args){
int opcion;
Ejercicio_10 invocametodos = new Ejercicio_10();
Scanner Entrada = new Scanner(System.in);
do {
    System.out.println("---------------------------");
    System.out.println("  Calculadora Aritmética   ");
    System.out.println("---------------------------");
    System.out.println("1....Suma");
    System.out.println("2....Resta");
    System.out.println("3....Multiplicacion");
    System.out.println("4....Division");
    System.out.println("5.... Salir");
    System.out.print("Selecciones su opcion: ");
    opcion=Entrada.nextInt();
    switch(opcion){
        case 1:{ 
                    invocametodos.Sumar(); //Llamar o invocar al metodo Sumar()
                    break;
                }//Fin case 1
        case 2:{
                    invocametodos.Restar();//Llamar o invocar al metodo Restar()
                    break;
                }//Fin case 2
        case 3:{
                    invocametodos.Multiplicar();//Llamar o invocar al metodo Multiplicar()
                    break;
                }//Fin case 3
        case 4:{
                    invocametodos.Division();//Llamar o invocar al metodo Dividir()
                    break;
                }//Fin case 4
                default:{
                    System.out.println("******Por favor seleccione una opción del menú, Gracias!!****");
                    break;
                }//Fin case 3
            }//Fin switch case
        } while (opcion!=5);
 }//Fin metodo main 
}//Fin clase
