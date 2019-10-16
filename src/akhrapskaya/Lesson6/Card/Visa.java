package akhrapskaya.Lesson6.Card;

public class Visa extends Card{
    private final static String S = "$";
    private final static int RATE = 2;

    protected Visa(String name) {
        super(name);
    }
    protected Visa(String name, int money){
        super(name, money);
    }
    protected boolean moneyGet(int sum, String s){
        if (s == S) {
            sum = sum * RATE;
            return super.moneyGet(sum);
        }
        else {
            System.out.println("Операция не выполнена. Неподдерживаемая валюта.");
            return false;
        }
    }
    protected void info(){
        System.out.println("Владелец карты: " + getName());
        System.out.println("Visa");
        balance();
    }

}
