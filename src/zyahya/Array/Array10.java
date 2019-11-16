package zyahya.Array;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (scn.hasNextInt()) {
            a = scn.nextInt();
            System.out.print("Делителями числа " + a + " являются ");
            for (int i = a; i > 0; i--) {
                b = a % i;
                if (b == 0)
                    System.out.print(i + " ");
            }
        }
    }
}


