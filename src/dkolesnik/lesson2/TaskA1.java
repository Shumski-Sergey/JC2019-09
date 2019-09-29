package dkolesnik.lesson2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        double a, b;
        int c = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа:");
        a = in.nextDouble();
        b = in.nextDouble();
        if ((c - a) > (c - b)) {
            System.out.println("Число B ближе к " + c);
        } else {
            if ((c - a) == (c - b)) {
                System.out.println("Число А равно числу B");
            } else {
                System.out.println("Число А ближе к " + c);
            }


        }
    }
}
