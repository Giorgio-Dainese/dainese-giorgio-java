package lezione6;

/**
 * Rovescia una stringa:
 * Crea un metodo statico ricorsivo che inverte una stringa.
 * Il metodo dovrebbe prendere come parametro la stringa da invertire e restituire la stringa invertita.
 * Per esempio, se il metodo riceve "java", dovrebbe restituire "avaj".
 *
 * @author Giorgio Dainese
 * 05/03/2024
 */
public class RovesciaUnaStringa {
    public static String rovesciaStringa(String x){
        if (x.length() < 2) return x;
        String primaLettera = x.substring(0,1);
        return rovesciaStringa(x.substring(1)) + primaLettera;
    }
    public static void main(String[] args) {
        System.out.println(rovesciaStringa("Java"));
    }//end main
}//end class
