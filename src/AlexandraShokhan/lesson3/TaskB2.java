package AlexandraShokhan.lesson3;

// 2. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;
import java.util.ArrayList;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int num = in.nextInt();

        ArrayList dividers = new ArrayList<>();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                dividers.add(i);
            }
        }
        System.out.println(dividers);
    }
}
