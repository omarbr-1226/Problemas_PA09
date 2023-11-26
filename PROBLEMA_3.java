/*
3. Escribir un método y su respectiva llamada, que termine si argumento entero positivo se trata de un 
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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero");
        num = sc.nextInt();
        Numero(num);
    }
    public static int Numero(int a){
        int primo;
        if (a %2==0){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
    return 0;
    }
}
