package lezione6;

/**
 * Fattoriale:
 * Scrivi un metodo statico ricorsivo che calcola il fattoriale di un numero intero dato.
 * Il fattoriale di un numero n (indicato con n!) è il prodotto di tutti i numeri interi positivi da 1 a n.
 * Assicurati che il tuo metodo gestisca correttamente il caso base (il fattoriale di 0 è 1).
 *
 * @author Giorgio Dainese
 * 05/03/2024
 */
public class Fattoriale {

    public static int fattoriale(int x){
        int risultato = 0;
        if(x==0){
             risultato = 1;
        }else
         risultato = x * fattoriale(x-1);
        return risultato;
    }
    public static void main(String[] args) {
        System.out.println(fattoriale(5));
    }//end main
}//end class
