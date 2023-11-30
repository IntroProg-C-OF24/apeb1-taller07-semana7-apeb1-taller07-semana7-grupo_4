package E00_Problemas;
/**
 * @author: Ricardo Espinosa y Juan Diego Camargo
 */
import java.util.Scanner;
public class E05_estudiantes {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String nombre, estado = null;
        double promedio;
        int i = 1;
        while (i <= 4) {
            System.out.println("Ingrese los datos del estudiante " + i);
            System.out.println("Nombre:");
            nombre = tc.next();
            System.out.println("Promedio final:");
            promedio = tc.nextDouble();
            if (promedio >= 7 && promedio <= 10)
                estado = "Aprobado";
            else if (promedio >= 0 && promedio < 7)
                estado = "Reprobado";
            System.out.println("Estudiante: " + nombre);
            System.out.println("Promedio: " + promedio);
            System.out.println(estado);
            i = i + 1; 
        }
    }   
}