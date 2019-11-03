package zyahya.Array;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random rand = new Random();
        System.out.println("initial array:");

        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(20);
            System.out.print(array[i] + " ");

        }

    }
}
