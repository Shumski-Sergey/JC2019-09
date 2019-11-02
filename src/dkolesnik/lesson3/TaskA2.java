package dkolesnik.lesson3;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        int k;
        int i;
        boolean t = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        k = in.nextInt();
        for (i = 2; i < k; i++) {
            if (k % i == 0) {
                t = false;
                break;
            }
        }
        if (t) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }
    }
}