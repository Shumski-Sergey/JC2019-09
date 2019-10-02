package akhrapskaya.Lesson3;

import java.util.Scanner;

public class Task3 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int m = sc.nextInt();
        if (m < 0)
            System.out.print("-");
        String s = "";
        m = Math.abs(m);
        for (int i = 1; m  != 0; i++){
            s = m % 10 + s;
            m = (m / 10);
            if (i % 3 == 0 && m != 0){
                s = " " + s;
            }
        }
        System.out.println(s);
    }
}
