package lezione6;

/**
 * Fibonacci:
 * Implementa un metodo statico ricorsivo che restituisce l'n-esimo numero della sequenza di Fibonacci.
 * Nella sequenza di Fibonacci, ogni numero è la somma dei due precedenti, con i primi due numeri che sono
 * 0 e 1. Il metodo dovrebbe prendere un indice n come parametro e restituire il numero di Fibonacci
 * corrispondente.
 * @author Giorgio Dainese
 * 05/03/2024
 */
public class Fibonacci {
    public static int fibonacci(int x){
        int risultato = 0;
        if(x == 0){
            return 1;
        } else if (x == 1) {
            return 1;
        } else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }//end main
}//end class
