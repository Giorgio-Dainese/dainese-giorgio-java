package lezione2.lezione2.lezione2;

/*Es1: Esercizio 1: Calcolatrice Semplice

Scrivi un programma Java che utilizza la classe Scanner
per prendere due numeri in input dall'utente.
Il programma poi chiede all'utente di scegliere un'operazione
matematica da eseguire tra i due numeri
        (addizione, sottrazione, moltiplicazione, divisione, modulo).
Il programma calcola il risultato dell'operazione scelta e
lo stampa a schermo.

Esercizio 2: Conversione Temperatura

Scrivi un programma Java che permetta all'utente di convertire una temperatura da Fahrenheit a Celsius.
Il programma dovrà:
Chiedere all'utente di inserire una temperatura in Fahrenheit.
Convertire la temperatura in Celsius usando la formula: C = (F - 32) * 5/9.
Stampare il risultato.
Utilizzare Scanner per l'input, e variabili di tipo double per le temperature.
        - dire nel caso dell'acqua se con quella temperatura
        sarebbe ghiaccio, acqua o vapore

Esercizio 3: Calcolo Distanza

Crea un programma Java che calcoli la distanza tra due punti nel piano cartesiano. Le coordinate dei punti (x1, y1) e (x2, y2) verranno fornite dall'utente. Il programma dovrà:

Chiedere all'utente di inserire le coordinate dei due punti.
Calcolare la distanza usando la formula: distanza = sqrt((x2 - x1)^2 + (y2 - y1)^2).
Stampare la distanza calcolata.
Ricorda di usare Math.sqrt per la radice quadrata e Math.pow per elevare a potenza, con variabili double.


         */

import java.util.Scanner;

public class EserciziPerCasa {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci numero 1: ");
        int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci numero 2: ");
        int n2 = Integer.parseInt(tastiera.nextLine());
        System.out.println("Scegli addizione, sottrazione, moltiplicazione, divisione o modulo: ");
        String operatore = tastiera.nextLine();
        if (operatore.equals("Addizione") || operatore.equals("addizione")){
            System.out.print( " Somma = " +(n1+n2));
        } else if (operatore.equals("Sottrazione")|| operatore.equals("sottrazione")) {
            System.out.println("Differenza = " +(n1-n2));
        } else if (operatore.equals("Moltiplicazione")|| operatore.equals("moltiplicazione")) {
            System.out.println(" Prodotto = " +(n1*n2));
        } else if (operatore.equals("Divisione")|| operatore.equals("divisione")) {
            System.out.println("Divisione = " +(n1/n2));
        }else if (operatore.equals("Modulo")|| operatore.equals("modulo")) {
            System.out.println("Modulo = " +(n1%n2));
        } else System.out.println("Operatore scritto non corretto");
        }

    }

