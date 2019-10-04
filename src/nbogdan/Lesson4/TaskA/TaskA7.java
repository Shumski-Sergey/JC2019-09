package nbogdan.Lesson4.TaskA;

import java.util.Scanner;

public class TaskA7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Введите число, мы посчитаем его факториал ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            fact *= (i + 1);
        }
        System.out.println("Факториал " + n + " = " + fact);
    }
}