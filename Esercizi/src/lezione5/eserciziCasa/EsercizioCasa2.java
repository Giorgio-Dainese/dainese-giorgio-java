package lezione5.eserciziCasa;

import java.util.function.IntToDoubleFunction;

/**
 *
 * @author giorgiodainese
 *Conversione temperatura:
 * Scrivi metodi statici per convertire la temperatura da Fahrenheit a Celsius e da Celsius a Fahrenheit.
 * Ogni metodo dovrebbe prendere un parametro double e restituire la temperatura convertita
 * 22/02/2024
 */
public class EsercizioCasa2 {
    public static double FahToCel(double tempFah){
        double ret =  5.0/9.0*(tempFah-32);
        return  ret;
    }
    public static double CelToFah(double tempCel){
        double ret =  32+9.0/5.0*(tempCel);
        return  ret;
    }
    public static void main(String[] args) {
        System.out.println(FahToCel(100));
        System.out.println(CelToFah(0));
    }
}
