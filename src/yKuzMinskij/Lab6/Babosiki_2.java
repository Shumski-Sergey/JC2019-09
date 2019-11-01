package yKuzMinskij.Lab6;

import java.util.Scanner;

public class Babosiki_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую сумму");
        double sum1 = sc.nextDouble();
        System.out.println("Введите вторую сумму");
        double sum2 = sc.nextDouble();
        BYN a1 = new BYN(sum1);
        BYN a2 = new BYN(sum2);

    }
}
class BYN {
    long rubles;
    char kop;
    BYN (double sum){
        this.rubles = (long) sum;
        this.kop = (char) ((sum- (long)sum)*100);
    }
    public long getRubles(){return this.rubles;}
    public char getKop () {return this.kop;}
}
