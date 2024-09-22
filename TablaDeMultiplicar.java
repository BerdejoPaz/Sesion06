
package Programas;

/*
crear un programa que permita ingresar numero y 
muestre su tabla de multiplicar
Por ejemplo
numero : 4
Resultado:
promedio=4.0 x 1.0 = 4.0
4.0 x 2.0 = 8.0
4.0 x 3.0 = 12.0
4.0 x 4.0 = 16.0
4.0 x 5.0 = 20.0
4.0 x 6.0 = 24.0
4.0 x 7.0 = 28.0
4.0 x 8.0 = 32.0
4.0 x 9.0 = 36.0
4.0 x 10.0 = 40.0
 */
import java.util.Scanner;
public class TablaDeMultiplicar {
     public static void main(String [] args){
         Scanner lectura=new Scanner(System.in);
        //declarar variables
        double numero,contador; 
         //entrada de datos
        System.out.println("Ingrese números.");
        numero=lectura.nextDouble();
        contador=1;
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
        
    }
}
