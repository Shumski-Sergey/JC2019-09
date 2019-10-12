package Tereshko.Lesson4;

import Tereshko.Lesson4.New.Search;

import java.util.*;

public class Poker extends Search {
    public static void main(String[] args) {
        Random RANDOM = new Random();
        String[] quallity = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        String[] nominus = {"Буба", "Пика", "Черви", "Креста"};
        int k = 0;
        String[] deck = new String[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[k] = nominus[i] + " " + quallity[j];
                k++;
            }

        }
        List<String> hand = Arrays.asList(deck);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much players will play?");
        int persons = scanner.nextInt();

            }
        }

