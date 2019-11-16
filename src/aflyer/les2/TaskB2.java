package aflyer.les2;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        for (int i = a; i > 0; --i)
            System.out.print(i + " ");
    }
}
