package akhrapskaya.Lesson3;

import java.util.Scanner;

public class Task2 {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int m = Math.abs(sc.nextInt());
        String s = "Число простое.";
        for (int i = 2; i < m / 2; i++){
            if ( m % i == 0) {
                s = "Число не является простым.";
                break;
            }
        }
        System.out.println(s);
    }
}
