package vtafeliuk.Lesson3;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int f = 1;

        for (int i = sc.nextInt(); i > 0; i--) {
            f *= i;
        }
        System.out.println("Факториал i равен: " + f);
    }
}
