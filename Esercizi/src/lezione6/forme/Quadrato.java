package lezione6.forme;

public class Quadrato extends lezione6.forme.Poligono {
    public static int perimetro(int lato, int altezza){
        return lato*4;

    }
    public static int area(int lato, int altezza){
        return lato*lato;
    }
}
