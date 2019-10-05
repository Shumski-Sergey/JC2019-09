package nsivko.lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a, b, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        a = sc.nextInt();
        b = a;
       while(b != 0){
           sum += b%10;
           b /= 10;
       }
        System.out.println("Сумма его чисел равна " + sum);
    }
}
