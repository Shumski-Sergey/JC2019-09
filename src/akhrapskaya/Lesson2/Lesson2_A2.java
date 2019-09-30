package akhrapskaya.Lesson2;

import java.util.Scanner;
import java.lang.Math;

public class Lesson2_A2 {

    public static void  main(String[] args) {
        double A, B, C, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа A, B, C");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.close();

        D =B*B-4*A*C;
        if (D < 0){
            System.out.println("Корней нет");
        }
        else if ( D == 0) {
            System.out.println( "X1= " + (-B)/(2*A) );
        }
        else  {
            D = Math.sqrt(D);
            System.out.println( "X1= " + ((-B)-D)/(2*A) );
            System.out.println( "X2= " + ((-B)+D)/(2*A) );
        }
    }
}
