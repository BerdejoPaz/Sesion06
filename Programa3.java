package Programas;
/*
crear un programa que permita ingresar una cantidad
Visualizar el digito mayor, la cantidad de digitos impares
y la suma de digitos pares.
Por ejemplo
Cantidad : 78952
Resultado:
dmay=9
dimp=3
sdpares=10
 */
import java.util.Scanner;
public class Programa3 {
    public static void main(String [] args){
        //declarar variables
        int cantidad, dmay,cdimp,r,sdpares,dig;
        Scanner lectura=new Scanner(System.in);
         //entrada de datos
        System.out.print("Ingresa una cantidad : ");
        cantidad=lectura.nextInt();
         //Proceso de datos
         dmay=0;
         cdimp=0;
         sdpares=0;
         while (cantidad>0) {
             dig=cantidad%10;
             if(dig>dmay){
                 dmay=dig;
             }
             r=dig%2;
             if (r==0){ 
                 sdpares+=dig;// variable acumulador
             }else {
                 cdimp++; 
             }
             cantidad=cantidad/10;
          }
         //Salida de datos
        System.out.println("El digito mayor es  : "+dmay);
        System.out.println("La  cantidad de digitos impares es  : "+cdimp);
        System.out.println("La  suma de los digitos pares es  : "+sdpares);
        } 
}
