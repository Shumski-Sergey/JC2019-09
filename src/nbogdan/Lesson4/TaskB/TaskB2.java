package nbogdan.Lesson4.TaskB;

import java.util.Random;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random k = new Random();
        int z, g;
        String[] card = {"2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "J ", "Q ", "K ", "A "};
        String[] suit = {"\u2666 ", "\u2660 ", "\u2663 ", "\u2665 "};
        String[][] koloda = new String[4][13];
        for (int i = 0; i < 4; i++) {
            for (int q = 0; q < 13; q++) {
                koloda[i][q] = suit[i] + card[q];
            }
        }
        System.out.println("Введите число игроков");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 10) {
                System.out.print("Карт не хватит на следующего игрока!");
                break;
            }
            System.out.print((i + 1) + " игрок: ");
            for (int y = 0; y <5; ) {
                z = k.nextInt(4);
                g = k.nextInt(13);
                if (koloda[z][g].equals("nope")) {continue;}
                System.out.print(koloda[z][g]);
                koloda[z][g] = "nope";
                y++;
            }
            System.out.print("\n");
        }
    }
}
