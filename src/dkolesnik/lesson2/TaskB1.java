package dkolesnik.lesson2;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 5 + (int) (Math.random() * 151);
        System.out.println("Случайно выбранное число из отрезка [5;155]: " + x);
        if (x > 25 && x < 100) {
            System.out.println("Число попадает в интервал (25;100)");
        } else {
            System.out.println("Число не попадает в интервал (25;100)");
        }
    }

}
