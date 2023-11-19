/*
4. Escriba una función y su respectiva llamada que devuelva el factorial de un número
 */
package Problemas_PA09;
import java.util.Scanner;

/**
 *
 * @author Omar Bautista
 * Elaborado:17/11/2023
 */
public class PROBLEMA_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double factorial=1;
        int num;
        
        System.out.println("Ingresa el numero que quieres sacar factorial");
        num=sc.nextInt();
        
        System.out.println("El factorial del numero "+num+" es: "+Factorial(num));
    }
    public static int Factorial(int x){
        int factorial=1;
        for (int i =x ; i >0; i--) {
            factorial=factorial*i;
        }
        return factorial;
    }
    
}
