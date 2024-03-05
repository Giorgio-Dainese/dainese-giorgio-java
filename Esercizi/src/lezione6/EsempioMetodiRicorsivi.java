package lezione6;

public class EsempioMetodiRicorsivi {

    //count down ricorsivo
    public static void countdown(int x){
        if (x > 0) {
            System.out.println(x);
            countdown(x-1);
        }
        else
            System.out.println("BOOOOOOM");
    }//
    public static void main(String[] args) {
        countdown(50);
    }//end main
}//end class
