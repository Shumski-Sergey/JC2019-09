package akhrapskaya.Lesson3;

import java.util.Scanner;

public class TaskB1 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int m = sc.nextInt();
        int n = 1;
        for (int i = 1; i <= m; i++){
            n *= i;
        }
        System.out.println(n);
    }
}
