/*
 1. Diseñe un programa que calcule e imprima el pago de 102 trabajadores que laboran en la Cía. 
GACMAN. Los datos que se leerán serán los siguientes:
a) Las horas trabajadas
b) El sueldo por hora
c) El tipo de trabajador (1.-obrero,2.-empleado)
Para calcular los pagos considerar lo siguiente:
• Los obreros pagan 12 % de impuesto
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
        double Obreros = 0, Empleados = 0;
        int numTrabajadores = 102;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numTrabajadores; i++) {
            int hrsTrabajadas = horasTrabajadas(sc);
            double sldoxHora = sueldoPorHora(sc);
            int tipo = tipoTrabajador(sc);

            double pago = calcularPago(hrsTrabajadas, sldoxHora, tipo);

            if (tipo == 1) {
                Obreros += pago;
            } else if (tipo== 2) {
                Empleados += pago;
            }

            System.out.println("El pago para el trabajador " + (i + 1) + " es: " + pago);
            System.out.println("-------------------------------------------------------------");
        }

        System.out.println("El total a pagar a los obreros es: " + Obreros);
        System.out.println("El total a pagar a los empleados es: " + Empleados);
    }

    public static int horasTrabajadas(Scanner sc) {
        System.out.println("Ingrese las horas trabajadas:");
        return sc.nextInt();
    }

    public static double sueldoPorHora(Scanner sc) {
        System.out.println("Ingrese el sueldo por hora:");
        return sc.nextDouble();
    }

    public static int tipoTrabajador(Scanner sc) {
        System.out.println("Ingrese el tipo de trabajador (1.-obrero, 2.-empleado):");
        return sc.nextInt();
    }

    public static double calcularPago(int horasTrabajadas, double sueldoPorHora, int tipoTrabajador) {
        double pago = horasTrabajadas * sueldoPorHora;

        if (pago >= 100000) {
            if (tipoTrabajador == 1) {
                pago *= 0.88;
            } else if (tipoTrabajador == 2) {
                pago *= 0.9;
            }
        }
        return pago;
    }
    
}
