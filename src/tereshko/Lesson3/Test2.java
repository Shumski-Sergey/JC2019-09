package tereshko.Lesson3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Double a=scanner.nextDouble();
        String s=(a%1==0 && a%a==0)?"Целое":"Нецелое";
        System.out.println(s);
    }
}
