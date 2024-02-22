package lezione5.eserciziCasa;
/**
 *
 * @author giorgiodainese
 *Contatore di lettere:
 * Scrivi un metodo statico che accetta una stringa e un carattere,
 * e conta quante volte quel carattere appare nella stringa.
 * Utilizza un ciclo for per scorrere la stringa
 * 22/02/2024
 */

import java.util.ArrayList;
public class EsercizioCasa1 {
    public  static int contatoreLettere (String stringa, String carattere){

        int contatore = 0;
        for (int i= 0; i < stringa.length();  i++){
            if(Character.toString((stringa.charAt(i))).equals(carattere)){
                contatore ++;
            }
        }
        return contatore;
    }
    public static void main(String[] args) {
        System.out.println(contatoreLettere("Saverioo", "o"));
    }
}
