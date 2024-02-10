/*Es1: (if-else-Scanner) Chiedere un numero e stampare "Pari" o "dispari"

Es2: (for) Chiedere quante temperature si vuole inserire
stampare il minimo, massimo e la media (senza array).

Es3: (for - ArrayList) salvare le temperature precedenti
stampare quelle maggiori di 10 gradi

Es4: (while) chiedere all'utente dei numeri e sommarli finché
non scrive 0 (terminare quando inserisce 0)

Es5: (String, substring) stampare il proprio nome al contrario
*/
package Lezione3;

import java.util.ArrayList;
import java.util.Scanner;


public class Esercizi {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = Integer.parseInt(tastiera.nextLine());
        if (numero%2==0){
            System.out.println("Pari");
        } else System.out.println("Dispari");


        System.out.println("Esercizio 2 e 3");
        System.out.println("Quante temperature vuoi inserire?");
        int nTemp = Integer.parseInt(tastiera.nextLine());
        int somma = 0;
        double media = 0;
        int min = 1000;
        int max = -1000;
        ArrayList<String> temperature = new ArrayList<String>();
        for (int i = 0; i < nTemp; i++){
            System.out.println("Inserisci la temperatura numero " +(i+1));
            int temp = Integer.parseInt(tastiera.nextLine());
            somma = somma + temp;
            media = somma/nTemp;
            if(temp> max){
                max = temp;
            }
            if(temp< min){
                min = temp;
            }
            if (temp > 10) {
                temperature.add(Integer.toString(temp));
            }
        }
        System.out.println("La media è: " +media);
        System.out.println("Il massimo è: " +max);
        System.out.println("Il minimo è:" +min);
        System.out.println("I maggiori di 10 sono: " +temperature);


        System.out.println("Esercizio 4");
        int number = 1;
        while(number != 0){
            System.out.println("Inserisci un numero: ");
            number = Integer.parseInt(tastiera.nextLine());
        }


        System.out.println("Esercizio 5");
        System.out.println("Scrivi il tuo nome: ");
        String nome = tastiera.nextLine();
        String inverso="";

        for (int j= nome.length()-1; j>=0; j--){
            inverso = inverso + nome.substring(j,(j+1));
        }



       /*
       for (int j= nome.length()-1; j>=0; j--){
            inverso = inverso + nome.charAt(j);
        }
        */
        System.out.println("Il contrario del tuo nome è: " +inverso);

    }
}
