package Lezione3;

public class Iterazione {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++){
            System.out.println(j);
        }

        //Array
        //Array si può stampare solo con for. Se si stampa direttamente con print viene
        // fuori solo l'indirizzo di memoria
        int[] a = new int[10];
        a[0] = 1;
        System.out.println(a[0]);
        int[] b = {1,2,3,4,5,6};
    }
}
