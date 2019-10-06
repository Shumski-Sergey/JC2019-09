package vtafeliuk.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        Random element = new Random();
        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {

            array[i] = element.nextInt(11);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < a/2; i++) {
            int temp = array[i];
            array[i] = array[a - i - 1];
            array[a - i - 1] = temp;
        }
        System.out.println("\n"); //для наглядности
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
