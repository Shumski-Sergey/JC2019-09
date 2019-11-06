package nbogdan.PokerStarsRemake;
class Library {}
/*import javafx.util.Pair;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class Library {
    private Player[] players = new Player[12];
    private static HashMap<Integer, String> deck = new HashMap<>();
    void startNewGame(int numOfPlayers) {
        players = new Player[numOfPlayers];
        deck = Player.getDeck();
        giveCardsToPlayers();
        giveNamesToPlayers();
    }
    private void giveNamesToPlayers() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < players.length; i++) {
        System.out.println("Введите номер " + (i + 1) + " игрока:");
        players[i].setName(sc.nextLine());
        }
    }
    public void Start() {
        startNewGame(5);
        for (Player player : players) {
            System.out.print(player.getName() + ", " + player.getStringCards() + "\n");
        }
    }
    private void giveCardsToPlayers() {
        HashMap<Integer, String> cards = new HashMap<>();
        Pair<Integer, String> WC;
        for (Player player : players) {
            WC = getCardFromDeck();
            cards.put(WC.getKey(), WC.getValue());
            WC = getCardFromDeck();
            cards.put(WC.getKey(), WC.getValue());
            player.setCard(cards);
        }
    }
    private static Pair<Integer, String> getCardFromDeck() {
        int index;
        Pair<Integer, String> card;
        Random r = new Random();
        for ( ; ; ) {
            index = ((r.nextInt(4) + 1) * 100) + (r.nextInt(13) + 1);
            if (deck.isEmpty()) {
                System.out.println("EMPTY DECK ERROR");
                System.exit(0);
            }
            if (deck.containsKey(index)) {
                card = new Pair<>(index, deck.get(index));
                deck.remove(index);
                break;
            }
        }
        return card;
    }
    public static void main(String[] args) {}
}*/