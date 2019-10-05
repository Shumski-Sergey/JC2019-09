package ilyaSakalouski;

import java.util.Scanner;

public class lesson_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        if (a > 999){
            System.out.printf("%,d", a);
        } else {
            System.out.println(a);
        }
    }
}
