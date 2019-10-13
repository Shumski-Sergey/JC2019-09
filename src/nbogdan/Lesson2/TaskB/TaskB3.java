package nbogdan.Lesson2.TaskB;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, sum = 0;
        System.out.println("Введите число, чтобы посчитать сумму: ");
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Сумма целых чисел от 1 до " + a + ": " + sum);
    }
}
