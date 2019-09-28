package dmikulionak.lesson_2;

import java.util.Scanner;

public class A2_1 {
    public static void main (String[] args) {
//        ax^2+bx+c=0
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Введите число b: ");
        double b = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.print("Введите число c: ");
        double c = s3.nextInt();

        int D;
        double x1,x2;
        D = (int) (Math.pow(b,2)-4*a*c);
        int root;
        root=1;

        if (D == 0) {
            root = 2;
            }
        else {
            if (D>0) root = 3;
            if (D<0) root = 1;
        }
        switch (root) {
            case 1 :
                System.out.println("Квадратное уравнение не имеет корней");
                break;
            case 2 :
                x1= -b/2*a;
                System.out.println("Квадратное уравнение имеет 1 корень " + x1);
                break;
            case 3 :
                x1= (-b+Math.sqrt(D))/2*a;
                x2= (-b-Math.sqrt(D))/2*a;
                System.out.println("Квадратное уравнение имеет 2 корня " + x1 + " и " + x2);
                break;
        }
    }
}
