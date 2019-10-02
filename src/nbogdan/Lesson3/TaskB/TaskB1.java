package nbogdan.Lesson3.TaskB;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fac = 1;
        System.out.println("Введите число, мы посчитаем его факториал ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            fac *= (i + 1);
        }
        System.out.println("Факториал " + n + " = " + fac);
    }
}
