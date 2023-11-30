package E00_Problemas;
/**
 * @author Ricardo Espinosa y Juan Diego Camargo
 */
import java.util.Scanner;
public class E06_computadoras {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int tipoCliente, i;
        double costoPC;
        String nombCliente;
        i = 1;
        while (i <= 7){
            System.out.println("***************************");
            System.out.println("Ingresa los datos del cliente " + i);
            System.out.println("NOMBRE: ");
            nombCliente = tc.next();
            System.out.println("COSTO DE LA COMPUTADORA: ");
            costoPC = tc.nextDouble();
            System.out.println("TIPO DE CLIENTE: "); 
            tipoCliente = tc.nextInt();
            switch (tipoCliente) {
                case 1:
                    costoPC = costoPC - (costoPC * 0.1);
                    break;
                case 2:
                    costoPC = costoPC - (costoPC * 0.2);
                    break;
            }
            System.out.println("Cliente tipo" + tipoCliente);  
            System.out.println("Compra de un computador con precio de " + costoPC);
            i = i + 1;
        }   
    }   
}