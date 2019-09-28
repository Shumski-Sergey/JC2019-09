package GETOUT.Lesson;

import java.util.Scanner;

public class TestA {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a ;
        double b;
        double c;
        a=scanner.nextInt();
        b=scanner.nextDouble();
        c=scanner.nextDouble();


        if((Math.abs(b-a))>Math.abs(c-a)){
            System.out.println(c);
        }else if(b==a && c==a )
        {System.out.println("They are eqal");}
            else System.out.println(b);
    }
}
