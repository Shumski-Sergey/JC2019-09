package stitov.Lesson6.Card;

public class PersonalCard extends BasicCard {
    public PersonalCard(String hold, int eMonth, int eYear, int cCode, String numb) {
        super(hold, eMonth, eYear, cCode, numb);
    }
    private String nameOfBank;
    private String nameoOfCard;
    private long balance;
    public PersonalCard (String hold, int eMonth, int eYear, int cCode, String numb, String nBank, String nCard){
        super(hold, eMonth, eYear, cCode, numb);
        this.nameOfBank = nBank;
        this.nameoOfCard = nCard;
        this.balance = 0;
    }
    public String getNameOfBank() { return this.nameOfBank; }
    public String getNameoOfCard() {return this.nameoOfCard;}
    public long getBalance() { return this.balance; }
    public void setNameOfBank(String nameOfBank) { this.nameOfBank = nameOfBank; }
    public void setNameoOfCard(String nameoOfCard) { this.nameoOfCard = nameoOfCard; }
    protected void setBalance(long balance) { this.balance = balance; }
    public void showBalance() {System.out.println("Balance: "+this.balance+"$");}
    public void addMoney (long money){this.balance+=money;}
    public void withdrawMoney (long money){
        if (money>this.balance){
            System.out.println("Not enough money!");
        } else {this.balance-=money;}
    }
}
