package Programas;
//Crear un programa en java que permita ingresar una cantidad.
//Visualizar el numero de digitos de la cantidad Invertida.
// - Por ejemplo
// cantidad = 1234
// Resultado:
// caninv=4321
import java.util.Scanner;
public class Programa2 {
    public static void main(String [] args){
        //declarar variables
        int cantidad, caninv,dig;
         Scanner lectura=new Scanner(System.in);
         //entrada de datos
        System.out.print("Ingresa una cantidad : ");
        cantidad=lectura.nextInt();
        //Proceso de datos
        caninv=0;
        dig=0;
        while (cantidad>0) {
            dig=cantidad%10;
            caninv=(caninv*10) + dig;
            cantidad=cantidad/10;
              
        }
        //Salida de datos
        System.out.println("La  cantidad de digitos es  : "+caninv);
    }
}
