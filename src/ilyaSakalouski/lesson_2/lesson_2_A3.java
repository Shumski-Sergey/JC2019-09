package ilyaSakalouski.lesson_2;

import java.util.Scanner;

public class lesson_2_A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("Введите третье число: ");
        int c = sc.nextInt();
        if (b < a && b > c) {
            System.out.println(c + " " + b + " " + a);
        } else if (c < a && c > b) {
            System.out.println(b + " " + c + " " + a);
        } else if (a < b && a > c) {
            System.out.println(c + " " + a + " " + b);
        } else if (c < b && c > a) {
            System.out.println(a + " " + c + " " + b);
        } else if (b < c && b > a) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < c && a > b) {
            System.out.println(b + " " + a + " " + c);
        }
    }
}
