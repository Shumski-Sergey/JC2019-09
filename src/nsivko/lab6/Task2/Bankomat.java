package nsivko.lab6.Task2;

import java.util.Random;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        final int KUP1 = 20;
        final int KUP2 = 50;
        final int KUP3 = 100;

        Bankomatik kup = new Bankomatik();

        int kupT = kup.kolKup();
        int kupF = kup.kolKup();
        int kupH = kup.kolKup();

        Bankomatik sum = new Bankomatik(kupT, kupF, kupH);

        System.out.print("Введите сумму, которую хотите получить: ");
        Scanner s = new Scanner(System.in);
        int sumPeople = s.nextInt();

        int sumP = sumPeople;

        int sumMoney = sum.kolMoney(kupT, kupF, kupH);

        boolean pr = sum.provVyd(kupH, kupF, kupT, sumP, sumMoney);

        if (pr == true) {

            if (kupH != 0 && sumP >= KUP3) {

                int kH = (sum.kolH(sumP));

                kH = sum.provNalKup(kupH, kH);
                sumP = sum.obrabSum(KUP3, kH, sumP);

                if (sumP == 0) {
                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100.");
                } else {
                    if (kupF != 0 && (sumP % KUP2 != KUP1 / 2) && sumP >= KUP2 && ((sumP % 20 != 0 ) || (sumP % 50 == 0 )) ) {

                        int kF = (sum.kolF(sumP));
                        kF = sum.provNalKup(kupF, kF);
                        sumP = sum.obrabSum(KUP2, kF, sumP);

                        if (sumP == 0) {
                            System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100, " + kF + " по 50.");
                        } else {

                            int kT = (sum.kolT(sumP));
                            kT = sum.provNalKup(kupT, kT);
                            sumP = sum.obrabSum(KUP1, kT, sumP);

                            System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100, " + kF + " по 50, " + kT + " по 20.");
                        }
                    } else {
                        int kT = (sum.kolT(sumP));
                        kT = sum.provNalKup(kupT, kT);
                        sumP = sum.obrabSum(KUP1, kT, sumP);

                        System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kH + " по 100, " + kT + " по 20.");
                    }

                }

            } else if (kupF != 0 && (sumP % KUP2 != KUP1 / 2) && sumP >= KUP2 && ((sumP % 20 != 0 ) || (sumP % 50 == 0 ))) {
                int kF = (sum.kolF(sumP));
                kF = sum.provNalKup(kupF, kF);
                sumP = sum.obrabSum(KUP2, kF, sumP);
                if (sumP == 0) {
                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kF + " по 50.");
                } else {

                    int kT = (sum.kolT(sumP));
                    kT = sum.provNalKup(kupT, kT);
                    sumP = sum.obrabSum(KUP1, kT, sumP);

                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kF + " по 50, " + kT + " по 20.");
                }
            } else {
                if (kupT != 0) {
                    int kT = (sum.kolT(sumP));
                    kT = sum.provNalKup(kupT, kT);
                    sumP = sum.obrabSum(KUP1, kT, sumP);

                    System.out.println("\nВы получили Вашу сумму " + sumPeople + ": " + kT + " по 20.");
                }
            }
        }
    }


}
