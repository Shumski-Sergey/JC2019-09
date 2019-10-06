package nbogdan.FullPokerStars;

public class Player {
    private String name = "Неизвестный игрок";
    private String[] hand = new String[] {"", ""};
    private int point = 0;
    public Player(){};
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPoint() {return point;}
    public void setPoint(int point) {this.point = point;}
    public String[] getHand() {return hand;}
    public String showHand(){
        String s;
        s = this.hand[0];
        s += this.hand[1];
        return s;
    }
    public void setHand(String[] hand) {this.hand = hand;}
}
