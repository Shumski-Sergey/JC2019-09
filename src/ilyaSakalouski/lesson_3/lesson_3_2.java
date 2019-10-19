package ilyaSakalouski.lesson_3;

import java.util.Scanner;

public class lesson_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        if ((a%1)==0 && (a%a)==0) {
            System.out.println("простое");
        } else {
            System.out.println("не простое");
        }
    }
}
