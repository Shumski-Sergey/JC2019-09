package nbogdan.Lesson4.TaskMassive;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите размерность");
        int size = sc.nextInt(), WC = 0;
        int[] mass = new int[size];
        for (int a = 0; a < mass.length; a++) {
            mass[a] = r.nextInt(100);
            System.out.print(mass[a] + " ");
        }
        System.out.print("\n");
        for (int a = mass.length - 1; a >= 0; a--) {
            System.out.print(mass[a] + " ");
        }
    }
}
