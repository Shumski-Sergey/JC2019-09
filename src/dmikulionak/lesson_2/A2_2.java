package dmikulionak.lesson_2;

import java.util.Scanner;

public class A2_2 {
    public static void main (String[] args){

    Scanner s1 = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = s1.nextInt();

    Scanner s2 = new Scanner(System.in);
        System.out.print("Введите число b: ");
        double b = s2.nextInt();

    Scanner s3 = new Scanner(System.in);
        System.out.print("Введите число c: ");
        double c = s3.nextInt();

    double D,x1,x2;
        D = (Math.pow(b,2)-4*a*c);
        if (D==0){
            x1= -b/2*a;
            System.out.println("Квадратное уравнение имеет 1 корень " + x1);
        }
        else {
            if (D>0){
                x1= (-b+Math.sqrt(D))/2*a;
                x2= (-b-Math.sqrt(D))/2*a;
                System.out.println("Квадратное уравнение имеет 2 корня " + x1 + " и " + x2);
            }
            else {
                System.out.println("Выражение не имеет корней");
            }
        }
    }
}
