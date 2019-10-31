package akhrapskaya.Utils;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utils {
    /**
     * Create ArrayList with random items.
     * @param min - int lower bound.
     * @param max - int upper bound.
     * @param n - number of items.
     */
     public static ArrayList<Integer> setListRand (int min, int max, int n){
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            list.add(rand.nextInt(Math.max(min,max)-Math.min(min,max)) + Math.min(min,max));
        }
        return list;
    }

    /**
     * Input integer number from the console from a given interval (0, k).
     * @param s String. Explanation of exactly what we want to get.
     * @param k int. Upper bound.
     * @return int.
     */
    public static int putInInt (String s, int k){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println(s);
        do {
            System.out.println("Число должно быть из интервала (0;" + k + ")!");
            while (!sc.hasNextInt()) {
                System.out.println("Это не число!");
                sc.nextLine();
            }
           i = sc.nextInt();
        } while (i <= 0 || i > k);
        return i;
    }

}
