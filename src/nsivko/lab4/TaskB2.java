package nsivko.lab4;

import java.util.Random;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        System.out.print("Введите число игроков: ");
        Scanner ch = new Scanner(System.in);
        int a = ch.nextInt();
        int size = a;
        String[] mast = {"heart", "diamond", "club", "spade"};
        String[] karty = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int n = mast.length * karty.length;
        String[] koloda = new String[n];
        if (a >= 1 && a <= 10 ) {
            for (int i = 0; i < mast.length; i++) {
                for (int j = 0; j < karty.length; j++) {
                    koloda[karty.length * i + j] = karty[j] + " " + mast[i];
                }
            }
            for (int i = 0; i < n; i++) {
                int r = (int) (Math.random() * (n-1));
                String temp = koloda[r];
                koloda[r] = koloda[i];
                koloda[i] = temp;
            }
            String[][] kartyI = new String[size][5];
            for(int i = 0; i < size; i++){
                for (int j = 0; j < 5; j++) {
                    kartyI[i][j] = koloda[5*i + j];
                }
            }
            for(int i = 0; i < size; i++){
                int m = i + 1;
                System.out.print("Карты " + m + "-го игрока: ");
                for(int j = 0; j < 5; j++){
                    System.out.print("    " + kartyI[i][j]);
                }
                System.out.print("\n\n");
            }
        }
        else if (a < 1){
            System.out.println("Такого количества игроков быть не может!");
        }
        else if (a > 10) {
            System.out.println("Слишком большое количество игроков. Запустите программу заново и введите другое число.");

        }
    }
}
