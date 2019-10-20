package yKuzMinskij.Lab6;

import java.util.Scanner;

/**
 * Класс Деньги для работы с денежными суммами.
 * Число должно быть представлено двумя полями: типа long для рублей и типа char - для копеек.
 * Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
 * Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число,
 * умножение на дробное число и операции сравнения. В функции main проверить эти методы.
 */
public class Babosiki {
    public static void main (String[] args) {
        System.out.println("Ведите первую сумму");
        Scanner sc = new Scanner(System.in);
        double sum1 = sc.nextDouble();
        System.out.println("Введите вторую сумму");
        double sum2 = sc.nextDouble();
        Money a = new Money(sum1,sum2);
        a.getSum();
        a.getSubtraction();
        a.getMultiplication();
        a.getDivision();


    }
}
class Money{
    long rubles1;
    long rubles2;
    int kop1;
    int kop2;

    Money (double sum1, double sum2) {
        this.rubles1 = (long) sum1;
        this.rubles2 = (long) sum2;
        this.kop1 = (int) ((sum1-rubles1)*100+1);
        this.kop2 = (int) ((sum2-rubles2)*100+1);
    }
    public void getSum (){
        long sumR = rubles1 + rubles2;
        int sumK = kop1 + kop2;
        if (sumK>100){
            sumK = sumK-100;
            sumR++;
        }
        System.out.println("Сумма : " + sumR + "," + sumK);
    }
    public void getSubtraction (){
        long subR = rubles1 - rubles2;
        int subK = kop1 - kop2;
        if (subK<0){
            subK = Math.abs(subK);
            subR--;
        }
        subK = (char)subK;
        System.out.println("Разница : " + subR + "," + subK);

    }
    public void getMultiplication (){
        double mult= (rubles1 + (kop1/100)) * (rubles2 + (kop2/100));
        long multR = (long) mult;
        char multK = (char) (mult - (long)mult);
        System.out.println("Произведение : " + multR + "," + multK);
    }
    public void getDivision () {
        double div = (rubles1 + kop1) / (rubles2 + kop2);
        long divR = (long) div;
        char divK = (char)(div - (long)div);
        System.out.println("Результат деления : " + divR + "," + divK);
    }
}