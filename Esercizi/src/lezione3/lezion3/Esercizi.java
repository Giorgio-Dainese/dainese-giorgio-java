/*Es1: (if-else-Scanner) Chiedere un numero e stampare "Pari" o "dispari"

Es2: (for) Chiedere quante temperature si vuole inserire
stampare il minimo, massimo e la media (senza array).

Es3: (for - ArrayList) salvare le temperature precedenti
stampare quelle maggiori di 10 gradi

Es4: (while) chiedere all'utente dei numeri e sommarli finché
non scrive 0 (terminare quando inserisce 0)

Es5: (String, substring) stampare il proprio nome al contrario
*/
package lezione3.lezion3;

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

        System.out.println("Quante temperature vuoi inserire?");
        int nTemp = Integer.parseInt(tastiera.nextLine());
        for (int i = 0; i < nTemp; i++){
            System.out.println("Inserisci la temperatura numero " +(i+1));
            int temp = Integer.parseInt(tastiera.nextLine());
        }
    }
}
