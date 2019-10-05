package nsivko.lab3;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        int a;
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        a = ch.nextInt();
        int b = a;
        System.out.print("Делители числа: 1");
        for(int i = 2; i <= a; i++){
            if(b % i == 0){
                System.out.print(", " + i);
            }
        }
    }

}
