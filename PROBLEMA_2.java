/*
2. En una escuela la colegiatura de los alumnos se determina según el número de materias que cursan. 
El costo de todas las materias es el mismo. Se ha establecido un programa para estimular a los 
alumnos, el cual consiste en lo siguiente: si el promedio obtenido por un alumno en el último periodo 
es mayor o igual que 9, se le hará un descuento del 30% sobre la colegiatura y no se le cobrara 
IVA; si el promedio obtenido es menor que 9 deberá pagar la colegiatura completa, la cual incluye 
el 10% de IVA. Obtener cuanto debe pagar un alumno.
 */
package Problemas_PA09;
import java.util.Scanner;

/**
 *
 * @author Omar Bautista
 * Elaborado:
 */
public class PROBLEMA_2 {
    //Modulo principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,costo,prom;
        char resp;

        do{
            System.out.println("Ingresa la cantidad de materias que cursan");
            T = sc.nextInt();

            System.out.println("Ingresa el costo de las materias");
            costo=sc.nextInt();

            System.out.println("Ingresa el promedio final");
            prom= sc.nextInt();

            float cole= Colegiatura(T,costo);
            System.out.println("La colegiatura a pagar es: ");
            System.out.println(cole);
            System.out.println(" ");

            if (prom>=9){
                System.out.println("Su promedio fue mayor a nueve por lo que se le hare un descuento del 30%");
                System.out.println("El total a pagar es: ");
                System.out.println(Descuento(prom,cole));
            }else{
                System.out.println("Su promedio fue menor a nueve por lo que se le cobrara un 10% más");
                System.out.println("El total a pagar es: ");
                System.out.println(Comision(prom,cole));
            }

            System.out.println("Desea agregar otro alumno? (s/n)");
            resp = sc.next().charAt(0);

        }while(resp=='s' || resp=='S');
    }
    //Modulo uno
    public static float Colegiatura(float a,float b){
        float colegiatura;
        colegiatura=a*b;
        return colegiatura;
    }
    //Modulo dos
    public static double Descuento(float cali,float coleg){
        double descuento=0;
        if(cali>=9){
            descuento=coleg-(coleg*0.30);
        } 
        return descuento;
    }
    //Modulo tres
    public static double Comision(double cali,double coleg ){
        double comision=0;
        if (cali<9){
            comision=coleg+(coleg*0.10);
        }
        return comision;
    }
}
