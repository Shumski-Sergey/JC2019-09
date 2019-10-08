package nsivko.lab4;

import java.util.Random;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число игроков: ");
        a = sc.nextInt();
        String[] koloda = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
        Random r = new Random();
        int size = a;
        String[][] karty = new String[size][5];
        for(int i = 0; i < size; i++){
            for (int j = 0; j < 5; j++) {
                karty[i][j] = koloda[r.nextInt(koloda.length)];
            }
         }
        for(int i = 0; i < size; i++){
            int m = i + 1;
        System.out.print("Карты " + m + "-го игрока: ");
           for(int j = 0; j < 5; j++){
               System.out.print(" " + karty[i][j]);
           }
           System.out.print("\n");
        }

    }
}
