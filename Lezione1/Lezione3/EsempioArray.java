package Lezione3;

import java.util.ArrayList;
import java.util.List;

public class EsempioArray {
    public static void main(String[] args) {
        List<Integer> numeri = new ArrayList<>();
        numeri.add(8);
        numeri.add(7);
        numeri.add(5);
        System.out.println(numeri);
        System.out.println(numeri.get(0));
        numeri.remove(1);
        System.out.println(numeri);
        System.out.println(numeri.size());
    }
}
