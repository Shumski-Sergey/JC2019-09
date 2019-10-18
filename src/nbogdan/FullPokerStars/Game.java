package nbogdan.FullPokerStars;

import java.util.Random;
import java.util.Scanner;

class Game {
    private static Scanner sc = new Scanner(System.in);
    private static Random r = new Random();
    private static Player[] players = Hand.getPlayers();
    private static String[][] koloda = Hand.getKoloda();
    private static String computerHand = "";
    private static int numPlayers = Hand.getNumPlayers();
    private static String getCardFromKoloda(){
        String WC;
        for (int i = 0; i <999; i ++) {
            int indexH = r.nextInt(4);
            int indexA = r.nextInt(13);
            if (koloda[indexH][indexA].equals("nope")) {continue;}
                WC = koloda[indexH][indexA];
                koloda[indexH][indexA] = "nope";
                return WC;
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
            computerHand += getCardFromKoloda();
        }
    }
    static void round3(){computerHand += getCardFromKoloda();}
    static void round4(){computerHand += getCardFromKoloda();}
    static void showComputerHand(){
        System.out.println("Раздача:");
        System.out.println(computerHand);
        /*for (String s: computerHand) {
            System.out.print(s + " ");
        }
        System.out.print("\n");*/
    }
    static void showResult() {
        for (int i = 0; i < numPlayers; i++) {
            HandChecker.setCards(computerHand, players[i].showHand(), i);
            System.out.println("Игрок " + (i + 1) + " " + players[i].getName() + ": " + players[i].showHand() + " " + players[i].getCombination());
        }
    }
    static void runFullGame() {
        round1();
        showResult();
        Check.toGo();
        round2();
        showComputerHand();
        showResult();
        Check.toGo();
        round3();
        showComputerHand();
        showResult();
        Check.toGo();
        round4();
        showComputerHand();
        showResult();
    }
}
