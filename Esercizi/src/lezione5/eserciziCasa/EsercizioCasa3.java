package lezione5.eserciziCasa;
/**
 *
 * @author giorgiodainese
 *Ricerca e sostituzione in ArrayList:
 * Scrivi un metodo statico che accetta un ArrayList di stringhe, una stringa da cercare e una stringa sostitutiva.
 * Il metodo dovrebbe sostituire tutte le occorrenze della stringa cercata nell'ArrayList con la stringa sostitutiva
 * 22/02/2024
 */

import java.util.ArrayList;
public class EsercizioCasa3 {
    public static ArrayList<String> SostituisciStringa(ArrayList<String> arrString, String cerca, String sostituzione){
        for (int i = 0; i< arrString.size(); i++){
            if(arrString.get(i).equals(cerca)){
                arrString.set(i,sostituzione);
            }
        }
        return arrString;
    }
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Sandro");
        array.add("Saverio");
        array.add("Serafino");
        array.add("Saverio");
        array.add("Sandro");
        System.out.println(SostituisciStringa(array, "Saverio", "SAVERIO"));

    }
}
