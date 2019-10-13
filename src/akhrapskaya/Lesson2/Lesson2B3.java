package akhrapskaya.Lesson2;

import java.util.Scanner;

public class Lesson2B3 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int sum = 0;
        for( int i = 1; i <= n; i++){
            sum+=i;
        }
        System.out.println("Сумма всех чисел = " + sum);
    }
}
