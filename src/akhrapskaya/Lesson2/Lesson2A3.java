package akhrapskaya.Lesson2;

import java.util.Scanner;

public class Lesson2A3 {

    public static void  main(String[] args) {
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа A, B, C");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();

        if ( A > B ){
            D = B; B = A; A = D;
        }
        if ( B > C ){
            D = C; C = B; B = D;
        }
        if ( A > B ){
            D = B; B = A; A = D;
        }
        System.out.println( A + " " + B + " " + C );
    }
}
