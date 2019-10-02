package akhrapskaya.Lesson3;

import java.util.Scanner;

public class TaskB2 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int m = sc.nextInt();
        for (int i = 1; i <= m / 2; i++){
            if ( m % i == 0) {
                System.out.print( i + " ");
            }
        }
    }
}
