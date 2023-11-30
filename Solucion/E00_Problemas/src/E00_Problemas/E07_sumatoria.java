package E00_Problemas;
/**
 * @author Ricardo Espinosa y Juan Diego Camargo
 */
public class E07_sumatoria {
    public static void main(String[] args) {
        int i ;
        float numerador, denominador;
        float division, acumulador;
        i = 1;
        numerador = -1;
        denominador = 1;
        acumulador = 0;
        while (i <= 10){
            System.out.print(numerador + "/" + denominador + "  ");
            division = (numerador / denominador);
            acumulador = (acumulador + division);
            numerador = numerador * (-1);
            denominador = denominador + 1;
            i = i + 1;
        }   
        System.out.println("Sumatoria total: " + acumulador);
    }
}