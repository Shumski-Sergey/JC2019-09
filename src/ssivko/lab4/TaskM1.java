package ssivko.lab4;

import java.util.Random;
import java.util.Scanner;

public class TaskM1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество оценок: ");
        int a = in.nextInt();
        int b, i;
        b = a;
        int s[] = new int[b];
        Random ran = new Random();
        System.out.print("Список оценок: ");
        for (i = 0; i < b; i++) {
            s[i] = ran.nextInt(11);
            System.out.print(s[i] + " ");
        }
        int max,d=0;
        max = s[0];
        for (int c = 1; c < b; c++) {
            if (s[c] > max) max = s[c];

        }
        System.out.println();
        System.out.print("Максимальная оценка  " + max);
        for (int c = 0; c < b; c++){
            if (max==s[c])
                System.out.println("\nНаходиться на месте: "+(c+1));
        }
    }
}
