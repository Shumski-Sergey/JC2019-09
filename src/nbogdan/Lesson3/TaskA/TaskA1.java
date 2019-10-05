package nbogdan.Lesson3.TaskA;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int sum = 0, x = sc.nextInt();
        for ( ; x > 0; ) {
            sum += x % 10;
            x = x / 10;
        }
        System.out.println("Сумма цифр данного числа: " + sum);
    }
}
