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
* */
package Problemas_PA09;

import java.util.Scanner;

public class PROBLEMA_1_V2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String trabajador;
        int hr,sueldo;
        float Pagar,impuesto;
        for (int i = 1; i < 102; i++) {
            sueldo=Sueldoxhr();
            hr=Horas();
            trabajador=Trabajador();
            sueldo=Sueldo(sueldo);
            impuesto=Impuesto(sueldo);
            
            if (sueldo<100000){
                System.out.println("Al trabajador de tipo "+trabajador+" se le debera pagar: ");
                System.out.println(impuesto);
            }else{
                System.out.println("Al trabajador de tipo "+trabajador+" se le debera pagar: ");Pagar=Sueldo(sueldo);
                System.out.println(Pagar);
            }
                System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////&&");
        }
    }


    //Modulo que lee las horas trabajadas
    public static int Horas(){
        int horas;
        System.out.println("Ingresa las horas trabajadas: ");
        horas=sc.nextInt();
        return horas;
    }
    //Modulo que lee el sueldo
    public static int Sueldoxhr(){
        int sueldo;
        System.out.println("Ingresa el sueldo por hora");
        sueldo= sc.nextInt();
        return sueldo;
    }
    //Modulo para calcular el sueldo total
    public static int Sueldo(int hrs){
        int pago,total;
        pago=Sueldoxhr();
        total=pago*hrs;
        return total;
    }
    //Modulo que lee el tipo de trabajador
    public static String Trabajador(){
        String tipo;
        System.out.println("Que tipo de trabajador eres?");
        tipo= sc.next();
        return tipo;
    }
    //Modulo para los impuesto cobrados
    public static float Impuesto(int sueld){
        int impuesto;
        float pagar;
        if (sueld>=100000){
            impuesto=sueld/10;
        }else{
            return sueld;
        }
        pagar=sueld-impuesto;
        return pagar;
    }
}
