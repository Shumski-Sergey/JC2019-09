package aflyer.les2;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int sum=0;
        for (int i=1; i<=a; i++)
            sum += i;
        System.out.println(sum);
    }
}
