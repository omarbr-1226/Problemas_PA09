/*
3. Escribir un método y su respectiva llamada, que termine si su argumento entero positivo se trata de un
numero primo o no.

 */
package Problemas_PA09;

import java.util.Scanner;

/**
 *
 * @author Omar Bautista
 * Elaborado: 
 */
public class PROBLEMA_3 {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int numero= numero();
        boolean esPrimo = Primo(numero);
        if (esPrimo) {
            System.out.println("El número " + numero + " es un numero primo.");
        } else {
            System.out.println("El número " + numero + " no es un numero primo.");
        }
    }
    public static int numero (){
        int numero;
        System.out.println("Ingresa un numero:");
        numero= sc.nextInt();
        return numero;
    }
    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
