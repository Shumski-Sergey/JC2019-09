package stitov.Lesson2.Lesson6.Money;

public class Money {
    private long rubles;
    private int penny;
    private static final short HUNDRED = 100;

    private int getPenny() {
        return this.penny;
    }

    private long getRubles() {
        return this.rubles;
    }

    private void setPenny(int penny) {
        this.penny = penny;
    }

    public void setRubles(long rubles) {
        this.rubles = rubles;
    }
    Money(long rubles, int penny){
        this.penny = penny;
        this.rubles = rubles;
    }
    private double getFullNumber(){
        return this.rubles+this.penny/HUNDRED;
    }
    int compareTo(Money money){
        return (Double.compare(this.getFullNumber(), money.getFullNumber()));
    }
    void showMoney(){
        System.out.println(getRubles()+","+getPenny());
    }
    void add(Money money){
        this.setPenny(money.getPenny());
        if (this.getPenny()>99){
            this.rubles +=1;
            this.penny-=100;
        }
        this.rubles +=money.getRubles() ;
    }
}
