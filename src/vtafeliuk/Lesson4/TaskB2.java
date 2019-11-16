package vtafeliuk.Lesson4;

/* 2.Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер. Программа получает
число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому)
 из рассортированной колоды. Разделяйте пять карт, выданных каждому игроку, пустой строкой. */

import java.util.Random;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {

        //создание колоды (card pack)

        String[] cardSuits = {"Spades;", "Hearts;", "Diamonds;", "Clubs;"};
        String[] cards = {"2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Jack ", "Queen ", "King ", "Ace "};

        String[][] cardPack = new String[4][13];

        //наполнение колоды

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 13; j++) {
                cardPack[i][j] = cards[j] + cardSuits[i];
                System.out.print(cardPack[i][j] + " ");
            }
        }

        // создание кол-ва игроков и принципа раздачи карт

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of players: ");
        int n = sc.nextInt();
        while (n < 1 || n > 9) {
            System.out.println("\nEnter the number of players: ");
            n = sc.nextInt();
        }
        Random r = new Random();

        for (int k = 1; k <= n; k++) {
            System.out.println();
            for (int c = 1; c < 6; c++) {
                int a = r.nextInt(4);
                int b = r.nextInt(13);

                while (cardPack[a][b].equals("Card has been already choosen")) {
                    a = r.nextInt(4);
                    b = r.nextInt(13);
                }
                System.out.print(cardPack[a][b] + " ");
                cardPack[a][b] = "Card has been already choosen";
            }
        }
    }
}