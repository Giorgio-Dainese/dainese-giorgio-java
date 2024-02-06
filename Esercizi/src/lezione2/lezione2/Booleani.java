package lezione2.lezione2;

import java.util.Scanner;

public class Booleani {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(b);
        System.out.println(!b);
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && a);
        System.out.println(b && b);
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || a);
        System.out.println(b || b);

        System.out.println("Esercizio controllo età");
        Scanner tastiera = new Scanner(System.in);
        int eta = Integer.parseInt(tastiera.nextLine());
        boolean condizione = eta>=18;
        System.out.println(condizione);

        //Chiedere un numero, stampare true se è pari
        System.out.println("Esercizio pari");
        System.out.println("Insersci un numero: ");
        Scanner tasti = new Scanner(System.in);
        int numero = Integer.parseInt(tasti.nextLine());
        boolean pari= numero%2==0;
        System.out.println("Il numero è pari? " +pari);

        //Chiedere un anno, stampare true se è bisestile
        System.out.println("Esercizio anno bisestile");
        System.out.println("Insersci un anno: ");
        Scanner tasto = new Scanner(System.in);
        int anno = Integer.parseInt(tasto.nextLine());
        boolean bisestile= (numero%4==0) && (numero%100!=0) || numero%400==0;
        System.out.println("L'anno è bisestile? " +bisestile);

    //Stampare true o false se un login Utente Password è corretto o meno.


        Scanner tast = new Scanner(System.in);
        System.out.println("Inserisci utente: ");
        String utente = tast.nextLine();
        System.out.println("Inserisci password: ");
        String password = tast.nextLine();
        boolean conditio = utente.equals("utente") && password.equals("password");
        System.out.println(conditio);
        if (conditio) {
            System.out.println("Messaggio segreto");
        } else{
            System.out.println("User e/o password errati");
        }





    }
}
