/*
Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo
del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado. 
Presentar un reporte como el siguiente:
 */
package E00_Problemas;

/**
 * @author Ricardo Espinosa y Juan Diego Camargo
 */
import java.util.Scanner;
public class E03_Empleados {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] dias = new int[5];
        double[] costoDia = new double[5];
        double[] valorFinal = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del empleado: ");
            nombre[i] = tc.next();
            System.out.print("Ingrese el numero de dias trabajados: ");
            dias[i] = tc.nextInt();
            System.out.print("Ingrese el costo del dia de trabajo: ");
            costoDia[i] = tc.nextDouble();
            valorFinal[i] = dias[i] * costoDia[i];
        }
        System.out.println("\nTabla de empleados");
        System.out.println("Nombre\tDias\tCosto por Dia\tValor Final");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s\t%d\t%.2f\t\t%.2f\n", nombre[i], dias[i], costoDia[i], valorFinal[i]);
        }
    }
}
