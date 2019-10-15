package akhrapskaya.Lesson6;

import java.util.Scanner;

public class Atm {
    private int n20, n50, n100;
    private final static int K20 = 20;
    private final static int K50 = 50;
    private final static int K100 = 100;

    private Atm(int n20, int n50, int n100){
        this.n20 = n20;
        this.n50 = n50;
        this.n100 = n100;
    }
    private void atmAdd(int n20, int n50, int n100){
        this.n20 += n20;
        this.n50 += n50;
        this.n100 += n100;
    }
    private int atmAll(){
        return K20*n20+K50*n50+K100*n100;
    }
    private void putOutBalance(){
        System.out.println(" x100 - " + n100 + " x50 - " + n50 + " x20 - " + n20 + ". Итого: " + atmAll());
    }
    private  boolean getCash(int sum){
        boolean b = false;
        int k20, k50, k100, m;
        k20=k50=k100=m=0;
        for(int i = 0; i <= n100; i++){
            for( int j = 0; j <= n50; j++){
                m = (sum-i*K100-j*50);
                if(m % 20 == 0 && m / 20 <= n20 && m / 20 > 0){
                    k100 = i;     n100-=k100;
                    k50 = j;      n50-=k50;
                    k20 = m / 20; n20-=k20;
                    b = true;
                    break;
                }
            }
            if(b)
               break;
        }
        if (b)
            System.out.println("x100 - " + k100 + " x50 - " + k50 + " x20 - " + k20);
        else
            System.out.println("Невозможно выдать запрашиваемую сумму.");
        return b;
    }
    public static void  main(String[] args){
        Atm q = new Atm(0, 0 , 0);
        q.atmAdd(100, 100, 100);
        q.putOutBalance();
        System.out.println("Введите сумму");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        q.getCash(sum);
        q.putOutBalance();
    }
}
