package ilyaSakalouski;

import java.util.Scanner;

public class lesson_2_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m, n;
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО: ");
        m = sc.nextDouble();
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО: ");
        n = sc.nextDouble();
        if (Math.abs(10 - m) > Math.abs(10 - n)) {
            System.out.println(n);
        } else if (Math.abs(10 - m) < Math.abs(10 - n)) {
            System.out.println(m);
        } else if (Math.abs(10 - m) == Math.abs(10 - n)) {
            System.out.println("Числа равноудалены от 10");
        }
    }
}