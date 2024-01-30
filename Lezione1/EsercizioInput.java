import java.util.Scanner;
public class EsercizioInput {
    public static void main(String[] args){ //args è uguale sia prima sia dopo le quadre
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci il nome:");
        String nome = tastiera.nextLine();
        System.out.print("Inserisci il cognome:");
        String cognome = tastiera.nextLine();
        System.out.println("Ciao " + nome +" " + cognome); // ln serve per andare a capo
        System.out.print("Quanti anni hai?");
        int eta = 2*(Integer.parseInt(tastiera.nextLine())); //cast della variabile. da stringa convertita a intero.  Meglio evitare caratteri speciali per nominare le variabili.
        double n1 = (double)eta; //cast da int eta a double n1.
        System.out.println("Hai ben " +eta +" anni");
        System.out.println("Variabile eta int convertita in double: " +n1);
    }
}