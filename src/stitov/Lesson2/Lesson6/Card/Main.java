package stitov.Lesson2.Lesson6.Card;

public class Main {
    public static void main(String[] args) {
    CreditCard cc = new CreditCard("MrIvanov", 12,2012,666, "1234123412341234","Sberbank","VIP");
    cc.showBalance();
    cc.addMoney(1000);
    cc.showBalance();
    cc.withdrawMoney(2000);
    cc.setCreditLimit(2000);
    cc.withdrawMoney(5000);
    cc.showBalance();
    }
}
