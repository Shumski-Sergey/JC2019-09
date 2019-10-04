package Tereshko.Lesson3;

import java.util.Scanner;

public class TestB2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i = 1; i <=a; i++) {
            if(a%i==0){
                System.out.print(i+" ");
            }

        }
    }
}
