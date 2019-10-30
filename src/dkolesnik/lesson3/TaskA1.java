package dkolesnik.lesson3;

import java.util.Scanner;

public class TaskA1 {
    public static void main (String[] args) {
        int k;
        int s = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        k = in.nextInt();
        int x = k;
        while (x != 0 ) {
            s += x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);

    }
}
