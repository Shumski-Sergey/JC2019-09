package nbogdan.FullPokerStars;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Scanner sc = new Scanner(System.in);
    private static Random r = new Random();
    private static Player[] players = Hand.getPlayers();
    private static String[][] koloda = Hand.getKoloda();
    private static String[] computerHand = new String[] {"", "", "", "", ""};
    private static int numPlayers = Hand.getNumPlayers();
    private static int indexH = 0, indexA = 0;
    private static String getCardFromKoloda(){
        String WC;
        for (int i = 0; i <999; i ++) {
            indexH = r.nextInt(4);
            indexA = r.nextInt(13);
            if (koloda[indexH][indexA].equals("nope")) {continue;}
            else {
                WC = koloda[indexH][indexA];
                koloda[indexH][indexA] = "nope";
                i = 13;
                return WC;
            }
        }
        return "getCardFromKolodaError";
    }
    static void round1() {
        for (int i = 0; i < numPlayers; i++) {
            players[i].setHand(new String[]{getCardFromKoloda(), getCardFromKoloda()});
        }
    }
    static void round2(){
        for (int i = 0; i < 3; i++){
            computerHand[i] = getCardFromKoloda();
        }
    }
    static void round3(){computerHand[3] = getCardFromKoloda();}
    static void round4(){computerHand[4] = getCardFromKoloda();}
    static void showComputerHand(){
        System.out.println("Раздача:");
        for (String s: computerHand) {
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }
    static void showPlayersCard(){
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Игрок "+ (i + 1)+ " " + players[i].getName() + " :" + players[i].showHand());
        }
    }
    static void runFullGame() {
        round1();
        showPlayersCard();
        round2();
        showComputerHand();
        showPlayersCard();
        round3();
        showComputerHand();
        showPlayersCard();
        round4();
        showComputerHand();
        showPlayersCard();
    }
}
