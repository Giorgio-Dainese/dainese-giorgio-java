/*

Esercizio 1 (variabili, input e cast) : chiedere all'utente due numeri con la virgola e stampare la loro somma

Esercizio 2 (if-else): Chiedere all'utente un numero. Stampare il doppio se è pari, la metà se è dispari

Esercizio 3 (for-if): quanto è la somma dei numeri da 1 a 100 pari o divisibili per 5?

Esercizio 4 (Liste): creare una lista di 10 nomi con ArrayList. Rimuovere quelli con la prima lettera una
vocale.

Esercizio 5 (filter): data una lista con 15 numeri, creare una nuova lista con solo quelli in posizione
dispari.

Esercizio 6 (terminale - while): chiedere in loop all'utente un numero da 1 a 4. Far eseguire una delle
seguenti azioni:
1 = inserimento numero lista
2 = rimozione numero lista
3 = stampa lista
4 = chiusura del programma.

*/


package Lezione4;

import java.util.ArrayList;
import java.util.Scanner;

public class eserciziInClasse {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        /* chiedere all'utente due numeri con la virgola e stampare la loro somma
         */
        System.out.println("Esercizio 1");
        System.out.println("Inserisci il primo numero: ");
        double n1 = Double.parseDouble(tastiera.nextLine());
        System.out.println("Inserisci il secondo numero: ");
        double n2 = Double.parseDouble(tastiera.nextLine());
        System.out.println("La loro somma é: " + (n1 + n2));

        /* (if-else): Chiedere all'utente un numero. Stampare il doppio se è pari, la metà se è dispari */
        System.out.println("Esercizio 2");
        System.out.println("Inserisci un numero: ");
        int num = Integer.parseInt(tastiera.nextLine());
        if (num % 2 == 0)
            System.out.println("È pari e il doppio è: " + (num * 2));
        else System.out.println("È dispari, la metà è: " + (num / 2)); //Non dà la metà corretta ma intera


        /* (for-if): quanto è la somma dei numeri da 1 a 100 pari o divisibili per 5? */
        System.out.println("Esercizio 3");
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0 || i % 5 == 0)
                sum = sum + i;
        }
        System.out.println(("La somma dei pari o dei multipli di 5 è: " + sum));


        /* (Liste): creare una lista di 10 nomi con ArrayList. Rimuovere quelli con la prima lettera una
        vocale. */
        System.out.println("Esercizio 4");
        ArrayList<String> nomi = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            System.out.println("Inserisci il " + (j + 1) + "° nome: ");
            nomi.add(tastiera.nextLine());
        }
        System.out.println(nomi);
        for (int k = 0; k < nomi.size(); k++) {
            if ((nomi.get(k).charAt(0) == ('A')) ||
                    (nomi.get(k).charAt(0) == ('E')) ||
                    (nomi.get(k).charAt(0) == ('I')) ||
                    (nomi.get(k).charAt(0) == ('O')) ||
                    (nomi.get(k).charAt(0) == ('U'))
            ) {
                nomi.remove(k);
                k--;
            }
        }
        System.out.println(nomi);


       /* filter): data una lista con 15 numeri, creare una nuova lista con solo quelli in posizione
dispari. */

        System.out.println("Esercizio 5");
        ArrayList<String> numeri = new ArrayList<>();
        for (int x = 0; x < 15; x++) {
            System.out.println("Inserisci il " + (x + 1) + "° numero: ");
            numeri.add(tastiera.nextLine());
            if(x%2==1){

        }
        System.out.println(numeri);

        }
    }
}
