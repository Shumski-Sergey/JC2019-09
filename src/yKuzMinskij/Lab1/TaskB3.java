package yKuzMinskij.Lab1;

import java.util.Scanner;

public class TaskB3 {
    public static void main (String[] args) {
        System.out.println("Введите любое целое положительное число");
        Scanner sc = new Scanner(System.in);
        int x = (int)sc.nextDouble();
        int sum = 0;
        if (x < 0){
            System.out.println("Вы ввели неверное число \n Попробуйте ещё раз");
        } else {
            for (int i = 1; i <= x; i++){
                sum+=i;
                }System.out.println("Результат " + sum);

        }
    }
}
