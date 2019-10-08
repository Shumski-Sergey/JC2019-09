package akhrapskaya.Lesson4.Arrays;

import java.util.Scanner;

public class TaskB2 {
    public static void  main(String[] args){
        int n = ent();
        String[] suits = {"CLUBS", "HEARTS","DIAMONDS", "SPADES"};
        String[] num = {"DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
        for(int i = 0; i < n; i++){
            for(int j = 0; j< 5; j++) {
                System.out.print(suits[(j*(n)+i) % 4] + num[(j*(n)+i) / 4] + " ");
            }
            System.out.println("\n");
        }
    }
    private static int ent(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число игроков:");
            int n = sc.nextInt();
            if (n > 10)
                System.out.println("Игроков должно быть не больше десяти:");
            else
                return n;
        }
    }
}
