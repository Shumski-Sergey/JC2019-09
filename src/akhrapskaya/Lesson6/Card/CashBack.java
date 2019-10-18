package akhrapskaya.Lesson6.Card;

public class CashBack extends Visa {
    private final static int P = 10;
    private CashBack(String name) {
        super(name);
        System.out.println("Карта с 'CashBack'");
    }
    private CashBack(String name, int money){
        super(name, money);
        System.out.println("Карта с 'CashBack'");
    }
    @Override
    protected boolean moneyGet(int sum) {
        boolean b;
        b = super.moneyGet(sum);
        if (b) {
            System.out.println("CashBack:");
            super.moneyAdd(sum * P / 100);
        }
        return b;
    }
    @Override
    protected void info(){
        System.out.println("Владелец карты: " + getName());
        System.out.println("Visa + CashBack");
        balance();
    }
    public static void  main(String[] args){
        Card c = new Card("Alex");
        System.out.println("Card");
        c.moneyAdd(200);
        c.moneyGet(150);
        c.balance();
        System.out.println(c.getName());
        System.out.println("");

        System.out.println("Visa");
        Visa v = new Visa("Tommy", 300);
        v.moneyAdd(100);
        v.moneyGet(500);
        v.balance();
        v.moneyGet(100, "$");
        v.info();
        v.moneyGet(100, "d");
        System.out.println("");

        System.out.println("CashBack");
        CashBack cb = new CashBack("Tommy");
        cb.moneyAdd(400);
        cb.moneyGet(200);
        cb.info();
    }
}
