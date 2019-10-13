package nsivko.lab4;

import java.util.Random;
import java.util.Scanner;

public class TaskM3 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner raz = new Scanner(System.in);
        int n = raz.nextInt();
        int[] mas = new int[n];
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            mas[i] = rand.nextInt();
        }
        System.out.print("Наш массив:");
        for(int i = 0; i < n; i++){
            System.out.print(" " + mas[i]);
        }
        if( n%2 == 0){
            for(int i = 0; i < n/2; i++) {
                int temp = mas[i];
                mas[i] = mas[n-1-i];
                mas[n-1-i] = temp;
            }
        } else {
            for(int i = 0; i < (n-1)/2; i++) {
                int temp = mas[i];
                mas[i] = mas[n-1-i];
                mas[n-1-i] = temp;
            }
        }
        System.out.print("\nНаш перевёрнутый массив:");
        for(int i = 0; i < n; i++){
            System.out.print(" " + mas[i]);
        }

    }
}
