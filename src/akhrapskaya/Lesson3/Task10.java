package akhrapskaya.Lesson3;

import java.util.Scanner;

public class Task10 {

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int m = sc.nextInt();
        int sum = 0;
        while ( m  != 0){
            sum += m % 10;
            m = m / 10;
        }
        System.out.println("Cумма цифр = " + sum);
    }
}
