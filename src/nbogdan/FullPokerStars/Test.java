package nbogdan.FullPokerStars;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hand.setNumPlayers(sc.nextInt());
        Hand.setNamePlayers();
        Game.runFullGame();
    }
}
