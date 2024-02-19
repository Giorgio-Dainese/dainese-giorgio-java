/*

Esercizio 1 crea un metodo min che prende come parametri int x e y e restituisce il minimo

(per testarlo: System.out.println(min(1,2)); deve stampare 1

Esercizio 2 crea un metodo contrario che prende un nome n e restituisce il nome al contrario (guardare codice su github vecchio)

per testarlo: System.out.println(contrario("Filippo")) deve stampare oppiliF

Esercizio 3 crea un metodo range che prende come parametro un numero n e restituisce una nuova List con i numeri da 0 a n-1

Esercizio 4 crea un metodo stampa che accetta una List<Integer> e stampa la lista di interi nel seguente modo:
"Lista [ n1 n2 n3 n4 n5]"

Tutti i metodi devono essere statici.

*/


package Lezione4;

import java.util.ArrayList;
import java.util.List;

public class esercizioMetodi {
    //esercizio 1
    public static int min(int x, int y){
        if (x<y){
            return x;
        }else return y;
    }

    //esercizio 2
    public static String contrario(String n){
        String inverso = "";
        for (int i= n.length()-1; i>=0; i--){
            inverso = inverso + n.substring(i,(i+1));
        }
        return  inverso;
    }

    //esercizio 3
    public  static ArrayList<String> range(int n){
        ArrayList<String> nRange = new ArrayList<>();
        for (int i = 0; i < n; i++){
            nRange.add(Integer.toString(i));
        }
        return nRange;
    }

    //esercizio 4
    public static int stampa(List<Integer> n ) {
        int lista =0;
        for (int i = 0; i< n.size(); i++){
            lista += n.get(i);
        }
        return lista;
    }

    public static void main(String[] args) {
        System.out.println(min(1,2));
        System.out.println(contrario("Filippo"));
        System.out.println(range(10));
        List<Integer> list = () {
        }
        System.out.println(stampa(list);
    }
}
