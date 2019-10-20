package stitov.Lesson2.Lesson6.Money;

public class Main {
    public static void main (String[] args){
        Money money1 = new Money(100,0);
        Money money2 = new Money(125, 34);
        money1.showMoney();
        money2.showMoney();
        money1.add(money2);;
        int i = (money1.compareTo(money2));
        System.out.println(i>0 ? "Первое число больше" : (i==0 ? "Числа равны": "Втоое число больше"));
    }
}
