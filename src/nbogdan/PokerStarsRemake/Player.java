package nbogdan.PokerStarsRemake;

import java.util.ArrayList;

class Player {
    private String name;
    private String[] cards = new String[2];
    private int point;
    private int[] intCards = new int[2];

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String[] getCards() {return cards;}
    public void setCards(int index, String card) {this.cards[index] = card;}
    public int[] getIntCards() {return intCards;}
    public void setIntCards(int index, int card) {this.intCards[index] = card;}
}
