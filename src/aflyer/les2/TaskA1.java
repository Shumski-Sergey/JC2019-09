package aflyer.les2;

import java.util.Scanner;

public class TaskA1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("ВВедите числа");
            double m = sc.nextDouble();
            double n = sc.nextDouble();
            if (Math.abs(10-m)!=Math.abs(10-n)) {
            double c = Math.abs(10-m)>Math.abs(10-n)?  n : m;
            System.out.println(c);}
            else System.out.println("Расстояние одинаковое");
        }
}
