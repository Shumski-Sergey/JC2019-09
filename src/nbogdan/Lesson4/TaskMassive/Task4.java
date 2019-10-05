package nbogdan.Lesson4.TaskMassive;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        int [][] mass = new int[size][size];
        int min = 0, max = size - 1;
        for (int i = 0; i < size / 2 + 1; i++) {
            while (min <= max) {
                mass[i][min] = 1;
                mass[max][min] = 1;
                min++;
            }
            min = i + 1;
            max--;
        }
        for (int[] i:mass) {
            for (int a: i) {
                System.out.print(a + " ");
            }
            System.out.print("\n");
        }

    }
}
