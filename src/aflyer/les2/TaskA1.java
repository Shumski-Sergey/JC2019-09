package aflyer.les2;

import java.util.Scanner;

public class TaskA1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("ВВедите числа");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int c = (10-m)>(10-n)?  n : m;
            System.out.println(c);
        }
}
