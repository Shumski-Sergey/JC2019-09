package Tereshko.Lesson2;

import java.util.Scanner;

public class TestA2 {
    public static void main(String[] args) {
        double d;
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double x1,x2;
        d=Math.pow(b,2)-4*a*c;
        if(d>0){
x1=(-b - Math.sqrt(d))/ (2*a);
x2=(-b + Math.sqrt(d))/ (2*a);
System.out.println(x1+" "+x2);
        }else if(d==0){
            x1=(-b- Math.sqrt(2)/ (2*a));
            x2=x1;
            System.out.println(x1+" "+x2);
        }else System.out.println("Equalization has no valid roots");

    }
}
