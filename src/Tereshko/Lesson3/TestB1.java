package Tereshko.Lesson3;

import java.util.Scanner;

public class TestB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(calc(a));
    }
        public static long calc(long n) {
            if (n <= 1)
                return 1;
            else
                return n * calc(n - 1);
        }
    }

