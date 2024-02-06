package lezione2.lezione2;
/*Scrivere un programma che chiede in input un nome e stampa la prima lettera e
l'ultima (suggerimento: substring)*/


import java.util.Scanner;

public class RiscaldamentoEs2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci nome: ");
        String nome =  tastiera.nextLine();
        System.out.println(nome.substring(0,1));
        System.out.println(nome.substring(nome.length()-1));
    }
}
