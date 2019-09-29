package Tereshko.Lesson2;

import java.util.Scanner;

public class TestB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a>=5&&a<=155){
            if(a>=25&& a<=100)System.out.println("Good");
            else System.out.println("This number are not on this interval");
        }
        else System.out.println("Wrong number");
    }
}
