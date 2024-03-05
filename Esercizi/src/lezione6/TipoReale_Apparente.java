package lezione6;

import lezione5.Bottiglia;
import lezione6.ereditarietà.BottigliaConTappo;

public class TipoReale_Apparente {
    public static void main(String[] args) {
        Bottiglia a = new Bottiglia(500);
        Bottiglia b = new Bottiglia(600);
        BottigliaConTappo c = new BottigliaConTappo(500);
        Bottiglia d = new Bottiglia(600);


        //d.chiudi();

        BottigliaConTappo e = (BottigliaConTappo) d; //cast
        e.chiudi();
        ((BottigliaConTappo) d).chiudi(); //cast
    }
}
