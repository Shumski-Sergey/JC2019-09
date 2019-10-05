package yKuzMinskij.Lab2;

import java.util.Scanner;

public class TaskA2 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("составное");
                break;
            } else if (i == num - 1) System.out.println("простое");
        }
    }
}

