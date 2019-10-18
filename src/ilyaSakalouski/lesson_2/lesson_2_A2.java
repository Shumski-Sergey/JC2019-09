package ilyaSakalouski.lesson_2;

import java.util.Scanner;

public class lesson_2_A2 {
    public static void main(String[] args) {
            System.out.println("Программа решает квадратное уравнение вида: ax^2 + bx + c = 0");
            System.out.println("Введите a, b и c:");
            Scanner in = new Scanner(System.in);
            int a, b, c;
            double k = 2;
            double D;
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            } else if (D == 0) {
                double x;
                x = (-b) / (a * k);
                System.out.println("Уравнение имеет единственный корень: x = " + x);
            } else {
                System.out.println("Уравнение не имеет действительных корней!");
            }
    }
}
