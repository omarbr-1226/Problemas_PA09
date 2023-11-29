/*
 1. Diseñe un programa que calcule e imprima el pago de 102 trabajadores que laboran en la Cía. 
GACMAN. Los datos que se leerán serán los siguientes:
a) Las horas trabajadas
b) El sueldo por hora
c) El tipo de trabajador (1.-obrero,2.-empleado)
Para calcular los pagos considerar lo siguiente:
• Los obreros pagan 10 % de impuesto
• Los empleados pagan 10 % de impuesto.
• Los trabajadores (obreros y empleados) que reciban un pago menor de 100,000 pesos no pagan 
impuesto.
• Al final se deberá imprimir el total a pagar a los trabajadores y a los empleados.
 */
package Problemas_PA09;
import java.util.Scanner;
/**
 *
 * @author Omar Bautista
 * Elaborado:
 */
public class PROBLEMA_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrs[]=new int[102],sueldHr[]=new int[102],obrero=0,empleado=0;
        String trabajadores[]=new String[102];
        //Inicializar vectores
        for (int i = 0; i < 102; i++) {
            hrs[i]=0;
            sueldHr[i]=0;
        }
        //Llena vectores
        for (int i = 0; i < 102; i++) {
            System.out.println("/////////////// Ingrese los datos para el trabajador numero "+(i+1)+" ///////////////");
             System.out.println("Ingresa las horas trabajadas");
            hrs[i]=sc.nextInt();
            System.out.println("Ingresa el sueldo por hora");
            sueldHr[i]=sc.nextInt();
            System.out.println("Que tipo de trabajador eres? ");
            trabajadores[i]=sc.next();
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        }
       
    }
    public  static int Gacman(int x,int y){
        double impuesto=0;
        for (int i = 0; i < 102; i++) {
            if (x<100000) {
                System.out.println("");
                y=0;
            }else{
                impuesto=(x*0.10)*x;
            }
        }
        return 0;
    }
    
}
