package nsivko.lab6;

import java.util.Random;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        int kup1 = 20;
        int kup2 = 50;
        int kup3 = 100;

        int kupT = kolKup();
        int kupF = kolKup();
        int kupH = kolKup();

        Bankomatik sum = new Bankomatik(kupT, kupF, kupH);

        System.out.print("Введите сумму, которую хотите получить: ");
        Scanner s = new Scanner(System.in);
        int sumPeople = s.nextInt();

        int sumP = sumPeople;

        int sumMoney = sum.kolMoney(kupT, kupF, kupH);

        boolean pr = provVyd(kupH, kupF, kupT, sumP, sumMoney);

        if (pr == true) {

            if (kupH != 0 && sumP >= kup3) {

                int kH = (sum.kolH(sumP));

                kH = provNalKup(kupH, kH);
                sumP = obrabSum(kup3, kupH, kH, sumP);

                if (sumP == 0) {
                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100.");
                } else {
                    if (kupF != 0 && (sumP % kup2 != kup1 / 2) && sumP >= kup2 && ((sumP % 20 != 0 ) || (sumP % 50 == 0 )) ) {

                        int kF = (sum.kolF(sumP));
                        kF = provNalKup(kupF, kF);
                        sumP = obrabSum(kup2, kupF, kF, sumP);

                        if (sumP == 0) {
                            System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100, " + kF + " по 50.");
                        } else {

                            int kT = (sum.kolT(sumP));
                            kT = provNalKup(kupT, kT);
                            sumP = obrabSum(kup1, kupT, kT, sumP);

                            System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100, " + kF + " по 50, " + kT + " по 20.");
                        }
                    } else {
                        int kT = (sum.kolT(sumP));
                        kT = provNalKup(kupT, kT);
                        sumP = obrabSum(kup1, kupT, kT, sumP);

                        System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100, " + kT + " по 20.");
                    }

                }

            } else if (kupF != 0 && (sumP % kup2 != kup1 / 2) && sumP >= kup2 && ((sumP % 20 != 0 ) || (sumP % 50 == 0 ))) {
                int kF = (sum.kolF(sumP));
                kF = provNalKup(kupF, kF);
                sumP = obrabSum(kup2, kupF, kF, sumP);
                if (sumP == 0) {
                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kF + " по 50.");
                } else {

                    int kT = (sum.kolT(sumP));
                    kT = provNalKup(kupT, kT);
                    sumP = obrabSum(kup1, kupT, kT, sumP);

                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kF + " по 50, " + kT + " по 20.");
                }
            } else {
                if (kupT != 0) {
                    int kT = (sum.kolT(sumP));
                    kT = provNalKup(kupT, kT);
                    sumP = obrabSum(kup1, kupT, kT, sumP);

                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kT + " по 20.");
                }
            }
        }
    }

    public static int obrabSum(int k, int kuH, int kkH, int sP) {

        int s = kkH * k;
        int sp = 0;

        if(sP % s != 0){
            sp = obnovS(sP, s);
        } else if (sP / s > 1){
            sp = sP - s;
        }

        return sp;
    }

    private static int kolKup () {

        int index1 =(int) (Math.random() * 10);
        int index2 = 11;

        Random ind = new Random();
        int index = ind.nextInt(index2);

        int kolkup = index1 * index;

        return kolkup;
    }

    private static int provNalKup(int k1, int k2) {

        if (k1 < k2) {
            k2 = k1;
        }

        return k2;
    }

    public static int obnovS(int s, int kup) {

        int newS = s % kup;

        return newS;
    }

    public static boolean provVyd(int k1, int k2, int k3, int v1, int v2) {
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
class Bankomatik{

    int twenty;
    int fifty;
    int hundred;

    Bankomatik(int kup1, int kup2,int kup3) {
        twenty = kup1;
        fifty = kup2;
        hundred = kup3;
    }

    public int kolMoney(int t, int f, int h) {

        int sumM = t * 20 + f * 50 + h * 100;

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

}