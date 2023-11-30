/*
Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 */
package E00_Problemas;
/**
 * @author Ricardo Espinosa y Juan Diego Camargo
 */
public class E01_Secuencia {
    public static void main(String[] args) {
    int num = 1, den = 10, i = 1;
    while (i<=6){   
        System.out.println(num + "/" + den);
        num++;
        den++;
        i++;
    }
    }
}
