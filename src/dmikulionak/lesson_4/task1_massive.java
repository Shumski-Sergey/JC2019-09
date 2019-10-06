package dmikulionak.lesson_4;

import java.util.Arrays;
import java.util.Random;

public class task1_massive {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));             //вывод массива
        int max;
        max = array[0];
        for (int value : array) {                               //what?
            if (value > max) {
                max = value;
            }
        }
        for (int i=0; i< array.length; i++) {
            if (array[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
