package nsivko.lab2;


import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int a, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        a = sc.nextInt();
        for (i= 1; i >= 1 && i <= a; i++){
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до " + a + " равна " + sum);
    }
}
