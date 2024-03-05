package lezione5.eserciziCasa;
/**
 *
 * @author giorgiodainese
 *Conversione del tempo:
 * Scrivi un metodo statico che converte i secondi in un formato ore:minuti:secondi.
 * Il metodo dovrebbe prendere un parametro intero per i secondi totali e restituire una stringa formattata.
 * Ad esempio, se l'input è 3661, il metodo dovrebbe restituire "1:01:01" per rappresentare 1 ora, 1 minuto e 1 secondo.
 * 22/02/2024
 */
public class EsercizioCasa4 {
    public static String FormattazioneSecondi(int secondi){
        String risultato;
        int ore = secondi/3600;
        int minuti = (secondi-(ore*3600))/60;
        int sec = secondi-(ore*3600)-(minuti*60);
        if(minuti<10&&sec<10){
            risultato=(ore+":0"+minuti+ ":0"+sec);
        }else if (minuti<10) {
            risultato = (ore + ":0" + minuti + ":" + sec);
        }else risultato = risultato = (ore + ":" + minuti + ":" + sec);
return risultato;
    }
    public static void main(String[] args) {
        System.out.println(FormattazioneSecondi(3661));
    }
}
