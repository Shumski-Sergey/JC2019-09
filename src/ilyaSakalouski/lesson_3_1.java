package ilyaSakalouski;

import java.util.Scanner;

public class lesson_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ЧИСЛО");
        int s = 0;
        for (int i = sc.nextInt(); i != 0 ; i/=10) {
            s += i%10;
        }
        System.out.println(s);
    }
}
