package GETOUT.Lesson;

import java.util.Scanner;

public class TestB3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=a;
        for (int i = 1; i <b ; i++) {
            a+=i;
        }System.out.println(a);
    }
}
