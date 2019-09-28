package Tereshko.Lesson;

import java.util.Scanner;

public class TestA {
    public static void main(String[] args) {
        int a = 10;
        double b = 8.5;
        double c= 12.45;


        if((Math.abs(b-10))>Math.abs(c-10)){
            System.out.println(c);
        }else System.out.println(b);
    }
}
