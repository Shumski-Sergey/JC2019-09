package ilyaSakalouski.lesson_3;

import java.util.Scanner;

public class lesson_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ЧИСЛО");
        int f = 1;
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            f = f * (i + 1);
        }
            System.out.println("ФАКТОРИАЛ ЧИСЛА РАВЕН:" + f);
    }
}
