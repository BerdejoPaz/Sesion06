
package Programas;
/*
crear un programa que permita ingresar numero y 
Visualizar su promedio hasta que ingrese un numero negativo
Por ejemplo
numero : 4 , 25 , 105, 12 , -1
Resultado:
promedio=36.5
 */
import java.util.Scanner;
public class PromedioNum {
    public static void main(String [] args){
         Scanner lectura=new Scanner(System.in);
        //declarar variables
   double numero, suma, contador; 
   contador=0;
   suma=0;
   //entrada de datos
        System.out.println("Ingrese números positivos para calcular el promedio. Ingrese un número negativo para finalizar.");
        numero=lectura.nextDouble();
       while (numero >= 0) {
            suma += numero;
            contador++;
            numero=lectura.nextDouble();
        }

        if (contador != 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        } 
      }
}
