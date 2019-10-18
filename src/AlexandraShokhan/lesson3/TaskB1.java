package AlexandraShokhan.lesson3;

// 1. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int num = in.nextInt();
        int variable = num;
        int n = 1;

        for (int i = 0; i < num; i++) {
            n = n * (variable - i);
        }
        System.out.print(num + "! = " + n);

    }
}
