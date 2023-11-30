/*
Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 */
package E00_Problemas;
public class E02_Secuencia {
    public static void main(String[] args) {
    int num = 5, den = 10, i = 1;
    while (i<=6){   
        System.out.println(num + "/" + den);
        num+=5;
        den+=2;
        i++;
    }
    }
}
