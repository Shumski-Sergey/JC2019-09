package zyahya;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {

        System.out.println("Введите целое число");
        int sum = 0;

        Scanner abc = new Scanner(System.in);

        for (int a = abc.nextInt(); a != 0; a = a / 10) {
            sum = sum + a % 10;
        }
        System.out.println("Summ = " + sum);

    }
}
