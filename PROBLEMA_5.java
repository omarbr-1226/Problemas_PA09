/*
5. Escriba una función y su respectiva llamada que devuelva el valor de un número elevado a la n 
potencia
 */
package Problemas_PA09;
import java.util.Scanner;
/**
 *
 * @author Omar Bautista
 * Elaborado:
 */
public class PROBLEMA_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUno,pote;
        
        System.out.println("Ingresa un numero");
        numUno=sc.nextInt();
        System.out.println("Ingresa la potencia");
        pote=sc.nextInt();
        
        System.out.println("La potencia es: "+Potencia(numUno,pote));
    }
    
    public static int Potencia(int x,int potencia){
        int potencias;
        potencias=x*x;
        for (int i = x; i < potencias;  i++) {
            potencia=potencia*x;
        }
        return potencias;
    }
}
