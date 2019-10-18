package nsivko.lab6.Task2;

import java.util.Random;

public class Bankomatik {

    private final int M20 = 20;
    private final int M50 = 50;
    private final int M100 = 100;
    private int twenty;
    private int fifty;
    private int hundred;


    Bankomatik(){}

    Bankomatik(int kup1, int kup2,int kup3) {
        this.twenty = kup1;
        this.fifty = kup2;
        this.hundred = kup3;
    }

    public int kolMoney(int t, int f, int h) {

        int sumM = t * M20 + f * M50 + h * M100;

        return  sumM;
    }

    public int kolT(int kol){

        kol /= 20;

        return kol;
    }
    public int kolF(int kol){

        kol /= 50;

        return kol;
    }

    public static int kolH(int kol) {

        kol /= 100;

        return kol;
    }

    protected static int obrabSum(int k, int kkH, int sP) {

        int s = kkH * k;
        int sp = 0;

        if(sP % s != 0){
            sp = obnovS(sP, s);
        } else if (sP / s > 1){
            sp = sP - s;
        }

        return sp;
    }

    protected static int kolKup () {

        int index1 =(int) (Math.random() * 10);
        int index2 = 11;

        Random ind = new Random();
        int index = ind.nextInt(index2);

        int kolkup = index1 * index;

        return kolkup;
    }

    protected static int provNalKup(int k1, int k2) {

        if (k1 < k2) {
            k2 = k1;
        }

        return k2;
    }

    protected static int obnovS(int s, int kup) {

        int newS = s % kup;

        return newS;
    }

    protected static boolean provVyd(int k1, int k2, int k3, int v1, int v2) {
        boolean p = true;
        int vy;

        if(v1 <= v2) {

            if(k1 == 0){
                if(k2 == 0){
                    if(k3 == 0){
                        p = false;
                        System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                    } else {vy = v1 % 20;
                        if(vy != 0){
                            p = false;
                            System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                        }
                    }
                } else {if(k3 == 0){
                    vy = v1 % 50;
                    if(vy != 0){
                        p = false;
                        System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                    }
                } else { vy = (v1 % 50) % 20;
                    if(vy != 0) {
                        p = false;
                        System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                    }
                }
                }
            } else if(k2 == 0){
                if(k3 == 0){
                    vy = v1 % 100;
                    if(vy != 0){
                        p = false;
                        System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                    }
                } else {vy = (v1 % 100) % 20;
                    if(vy != 0){
                        p = false;
                        System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                    }
                }
            } else {if(k3 == 0){
                vy = (v1 % 100) % 50;
                if(vy != 0){p = false;
                    System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                }
            } else { vy = ((v1 % 100) % 50) % 20;
                if((((v1 % 100) % 50) % 20 != 0) && ((v1 % 100) % 50 != 0) && ((v1 % 100) != 0) && ((v1 % 100) % 20 != 0)) {
                    p = false;
                    System.out.println("Ошибка! Банкомат не можеты выдать такую сумму, не хватает нужных купюр.");
                }
            }
            }

        }
        if(v1 > v2) {
            p = false;
            System.out.println("В банкомате нет столько денег.");
        }

        return p;
    }

}
