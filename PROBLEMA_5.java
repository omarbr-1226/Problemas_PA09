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
        System.out.println(numUno + "^" + pote + "=" + Potencia(numUno,pote));
    }
    
    public static int Potencia(int x,int potencia){
        int potencias=1;
            for (int i = 1; i <= potencia; i++) {
                potencias = potencias * x;
            }
            return potencias;

    }
}

