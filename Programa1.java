package Programas;
//Crear un programa en java que permita ingresar una cantidad.
//Visualizar el numero de digitos de la cantidad ingresada.
// - Por ejemplo
// cantidad = 1234
// Resultado:
// Cantig=4
import java.util.Scanner;
public class Programa1 {
    public static void main(String [] args){
        //declarar variables
        int cantidad, candig;
         Scanner lectura=new Scanner(System.in);
         //entrada de datos
        System.out.print("Ingresa un acantidad : ");
        cantidad=lectura.nextInt();
        //Proceso de datos
        candig=0;
        while (cantidad>0) {
            candig++;
            cantidad= cantidad/10;
                    
        }
        //Salida de datos
        System.out.println("La  cantidad de digitos es  : "+candig);
    }
}
