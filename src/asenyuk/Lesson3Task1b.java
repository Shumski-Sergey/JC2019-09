package asenyuk;

import java.util.Scanner;

public class Lesson3Task1b {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int f=1;
        int x = inpt.nextInt();
        System.out.println("x =" +x);
        for (int i=x;x>0;x--) {
            f=f*x;
        }
        System.out.println(f);
    }
}