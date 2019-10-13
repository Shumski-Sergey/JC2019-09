package dkolesnik.lesson2;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите три целых числа:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println("Ваши числа в порядке возрастания: " + a + " " + b + " " + c);
            } else if (a < c) {
                System.out.println("Ваши числа в порядке возрастания: " + a + " " + c + " " + b);
            } else {
                System.out.println("Ваши числа в порядке возрастания: " + c + " " + a + " " + b);
            }
        } else if (a < c) {
            System.out.println("Ваши числа в порядке возрастания: " + b + " " + a + " " + c);
        }
        else if (c < b) {
            System.out.println("Ваши числа в порядке возрастания: " + c + " " + b + " " + a);
            }
        else {
            System.out.println("Ваши числа в порядке возрастания: " + b + " " + c + " " + a);
        }
    }
}
