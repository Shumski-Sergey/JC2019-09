package vtafeliuk.Lesson4;

// Определить индексы максимальных элементов одномерного массива

import java.util.Random;
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов массива:");

        Random mark = new Random();

        int a = sc.nextInt();
        int[] array = new int[a];
        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int m = mark.nextInt(11);
            array[i] = m;
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < a; i++) {
            if (max < array [i]) {
                max = array [i];
                index = i;
            }
        }
        System.out.print("\nИндексы максимальных оценок:");
        for (int i = 0; i < a; i++) {
            if (array[i] == array[index]){
                System.out.print(" " + i );
            }
        }
    }
}
