package Tereshko.Lesson3;

import java.util.Scanner;

public class TestB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(falc(a));
    }
        public static int falc(int n) {
            if (n <= 1)
                return 1;
            else
                return n * falc(n - 1);
        }
    }

