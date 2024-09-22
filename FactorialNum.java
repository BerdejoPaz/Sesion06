
package Programas;
/*
crear un programa que permita ingresar un numero
Visualizar su Factorial
Por ejemplo
Cantidad : 8
Resultado:
Factorial=40320
 */
import java.util.Scanner;
public class FactorialNum {
     public static void main(String [] args){
        //declarar variables
      int cantidad, factorial, contador;
         Scanner lectura=new Scanner(System.in);
         //entrada de datos
        System.out.print("Ingresa un numero : ");
        cantidad=lectura.nextInt();  
         //Proceso de datos
        contador=1;
        factorial=1;
        while (contador <= cantidad) {
            factorial *= contador;
            contador++;
        }

        System.out.println("El factorial de " + cantidad + " es: " + factorial);
        
   } 
}
