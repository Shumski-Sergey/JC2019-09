package yKuzMinskij.Lab2;

import java.util.Scanner;

public class TaskB1 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int f= 1;
        for (int i = 1; i<=num; i++){
            f *= i;
        }
        System.out.println(f);
    }
}
