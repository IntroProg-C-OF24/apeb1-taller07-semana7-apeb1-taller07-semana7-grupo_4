/*
Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
*/
package E00_Problemas;
import java.util.Scanner;
/**
 * @author Ricardo Espinosa y Juan Diego Camargo
 */
public class E04_Jugadores {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String posicion;
        String nombre;
        int cont = 0, edad;
        double altura, totalEdad = 0, totalAltura = 0, promEdad, promAltura;
        String seguir = "si";
        while (seguir.equals("si")) {
            System.out.println("Ingrese el nombre ");
            nombre = tc.next();
            System.out.println("Ingrese la posicion");
            posicion = tc.next();
            System.out.println("Ingrese la altura");
            altura = tc.nextDouble();
            System.out.println("Ingrese la edad");
            edad = tc.nextInt();
            System.out.println("\n|Jugador: " + nombre + "|posicion: "+ posicion +"|altura: "+altura +"|edad: "+ edad+"|");
            System.out.println("\nDesea continuar ingresando, si o no");
            totalEdad = totalEdad + edad;
            totalAltura = totalAltura + altura;
            cont = cont + 1;
            seguir = tc.next();       
        }
        promEdad = (totalEdad / cont);
        promAltura = (totalAltura / cont);        
        System.out.println("\nPromedio de edad: " + promEdad);
        System.out.println("Promedio de altura: " + promAltura);
    }
}

    