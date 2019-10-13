package dmikulionak.lesson_2;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Введите число b: ");
        int b = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.print("Введите число c: ");
        int c = s3.nextInt();

        if (a<b){
            if (b<c){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            else if (a < c){
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
            else{
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
        else if (a<c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (c<b) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
    }
}
