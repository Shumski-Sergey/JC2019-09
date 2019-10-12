package dmikulionak.lesson_4;

import java.util.Scanner;

public class task_a7_massive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        int[] array = new int[m];
        int x = 1, fact = 0;
        for (int i = 0; i < m; i++) {
            array[i] = x;
            x++;
        }
        for (int i = 0; i < array.length; i++) {
            fact= fact * array[i];
            if (i == m - 1) {
                System.out.print("факториал числа "+ m + " равен " + fact);
            }

        }
    }
}

