package akhrapskaya.Lesson6.Card;

public class Card {
    private int money;
    private String name;

    Card(String name){
        this.name = name;
        money = 0;
    }
    Card(String name, int money){
        this.name = name;
        this.money = money;
    }
    void moneyAdd(int sum){
        money += sum;
        System.out.println("На счет добавлено " + sum + " рублей.");
    }
    protected boolean moneyGet( int sum){
        boolean b = true;
        if (sum < money){
            money-= sum;
            System.out.println("Со счета снято " + sum + " рублей.");
        }
        else {
            b=false;
            System.out.println("На счету не достаточно средств.");
        }
        return b;
    }
    void balance(){
        System.out.println("Баланс: " + money + " рублей.");
    }
    String getName(){
        return name;
    }
}
