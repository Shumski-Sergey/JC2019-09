package akhrapskaya.KR;

import java.util.ArrayList;
import java.util.Random;

public class Utils {
    /**
     * Create ArrayList with random items.
     * @param min - int lower bound.
     * @param max - int upper bound.
     * @param n - number of items.
     */
     static ArrayList<Integer> setListRand(int min, int max, int n){
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            list.add(rand.nextInt(Math.max(min,max)-Math.min(min,max)) + Math.min(min,max));
        }
        return list;
    }
}
