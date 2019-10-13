package yKuzMinskij.Lab1;

import java.util.Scanner;

public class TaskA2 {
    public static void main (String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        if (dis (a, b, c) > 0) {
            double x1 = (-b + Math.sqrt(dis (a, b, c))) / (2 * a);
            double x2 = (-b - Math.sqrt(dis (a, b, c))) / (2 * a);
            System.out.println("Первый корень " + x1);
            System.out.println("\n Второй корень " + x2);
        }
        else {
            if (dis (a, b, c)==0){
                double x = (-b + Math.sqrt(dis (a, b, c))) / (2 * a);
                System.out.println("У выражения один корень " + x);
            }
            else {
                if (dis (a, b, c)<0) {
                    System.out.println("У выражения нет корней");
                }
            }
        }
    }

    private static double dis (int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}



