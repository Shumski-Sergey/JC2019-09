package nbogdan.PokerStarsRemake;

import java.util.HashMap;

class Player {
    private static final HashMap<Integer, String> DECK = new HashMap<>() {{
        put(101, "\u26662");
        put(102, "\u26663");
        put(103, "\u26664");
        put(104, "\u26665");
        put(105, "\u26666");
        put(106, "\u26667");
        put(107, "\u26668");
        put(108, "\u26669");
        put(109, "\u266610");
        put(110, "\u2666J");
        put(111, "\u2666Q");
        put(112, "\u2666K");
        put(113, "\u2666A");
        put(201, "\u26652");
        put(202, "\u26653");
        put(203, "\u26654");
        put(204, "\u26655");
        put(205, "\u26656");
        put(206, "\u26657");
        put(207, "\u26658");
        put(208, "\u26659");
        put(209, "\u266510");
        put(210, "\u2665J");
        put(211, "\u2665Q");
        put(212, "\u2665K");
        put(213, "\u2665A");
        put(301, "\u26632");
        put(302, "\u26633");
        put(303, "\u26634");
        put(304, "\u26635");
        put(305, "\u26636");
        put(306, "\u26637");
        put(307, "\u26638");
        put(308, "\u26639");
        put(309, "\u266310");
        put(310, "\u2663J");
        put(311, "\u2663Q");
        put(312, "\u2663K");
        put(313, "\u2663A");
        put(401, "\u26602");
        put(402, "\u26603");
        put(403, "\u26604");
        put(404, "\u26605");
        put(405, "\u26606");
        put(406, "\u26607");
        put(407, "\u26608");
        put(408, "\u26609");
        put(409, "\u266010");
        put(410, "\u2660J");
        put(411, "\u2660Q");
        put(412, "\u2660K");
        put(413, "\u2660A");
    }};
    private String name;
    private HashMap<Integer, String> cards = new HashMap<>(2);
    private int point;

    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name; }
    static HashMap<Integer, String> getDeck() {
        return DECK;
    }
    void setCard(HashMap<Integer, String> cards) {this.cards = cards;}
    HashMap<Integer, String> getCards() {
        return this.cards;
    }
    String getStringCards() {
        String s = "";
        for (String a : cards.values()) {
            s += a;
        }
        return s;
    }
}