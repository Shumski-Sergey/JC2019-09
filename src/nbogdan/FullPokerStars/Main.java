package nbogdan.FullPokerStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте! Хотите поиграть в покер?");
        String s = sc.nextLine();
        if (Check.answer(s)) {System.out.println("Я рад! Но он пока в разработке :^)");}
        else System.out.println("Ну и идите отсюда");
    }
}
