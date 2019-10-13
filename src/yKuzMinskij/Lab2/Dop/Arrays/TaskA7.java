package yKuzMinskij.Lab2.Dop.Arrays;

import java.util.Scanner;

public class TaskA7 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        System.out.println("Факториал числа " + num + " равен " +f);
    }
}