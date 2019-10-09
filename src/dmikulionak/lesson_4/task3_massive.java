package dmikulionak.lesson_4;

import java.util.Arrays;
import java.util.Random;

public class task3_massive {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));             //вывод массива

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(" " + array[i] + " ");
        }
    }
}

