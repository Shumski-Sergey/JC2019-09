package nbogdan.PokerStarsRemake;

import java.util.Random;
import java.util.Scanner;

class Game {
    private static Random r = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static final String[][] DECKFINAL = {
            {"\u26662", "\u26663", "\u26664", "\u26665", "\u26666", "\u26667", "\u26668", "\u26669", "\u266610", "\u2666J", "\u2666Q", "\u2666K", "\u2666A"},
            {"\u26652", "\u26653", "\u26654", "\u26655", "\u26656", "\u26657", "\u26658", "\u26659", "\u266510", "\u2665J", "\u2665Q", "\u2665K", "\u2665A"},
            {"\u26632", "\u26633", "\u26634", "\u26635", "\u26636", "\u26637", "\u26638", "\u26639", "\u266310", "\u2663J", "\u2663Q", "\u2663K", "\u2663A"},
            {"\u26602", "\u26603", "\u26604", "\u26605", "\u26606", "\u26607", "\u26608", "\u26609", "\u266010", "\u2660J", "\u2660Q", "\u2660K", "\u2660A"}};
    private static final int[] INTDECKFINAL = {0,1,2,3,4,5,6,8,9,10,11,12};
    private String[][] deck;
    private int[] intDeck;
    static Player[] Players;
    void runFirstTime() {

    }
    void setPlayers() {
        Players = new Player[Check.setPlayers()];
        for (int i = 0; i < Players.length; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока: ");
            Players[i].setName(sc.next());
        }
    }
    void round1() {
        deck = DECKFINAL;
        intDeck = INTDECKFINAL;
        int a, h;
        for (Player player : Players) {
            for (int k = 0; k < 2; k++) {
                h = r.nextInt(4);
                a = r.nextInt(13);
                player.setCards(k, deck[h][a]);
                player.setIntCards(k, intDeck[a]);
            }
        }
    }
}
