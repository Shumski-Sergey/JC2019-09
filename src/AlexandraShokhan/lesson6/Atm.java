package AlexandraShokhan.lesson6;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        AverageAtm BelarusbankAtm = new AverageAtm(30,60,98);
        BelarusbankAtm.depositCash(30,0,7);
        BelarusbankAtm.displayBanknotes();

        Scanner in = new Scanner(System.in);
        System.out.println("How much cash would ypu like to withdraw?");
        int amountToWithdraw = in.nextInt();

        if (BelarusbankAtm.withdrawCash(amountToWithdraw) == true) {
            System.out.println("The operation completed successfully.");
        } else {
            System.out.println("The amount requested cannot be withdrawn.");
        }

    }
}

class AverageAtm {
    int numOf20;
    int numOf50;
    int numOf100;


    // Конструктор
    public AverageAtm(int numOf20, int numOf50, int numOf100) {
        this.numOf20 = numOf20;
        this.numOf50 = numOf50;
        this.numOf100 = numOf100;
    }

    // Метод довавления денег в банкоматю
    void depositCash(int deposit20, int deposit50, int deposit100) {
        numOf20 += deposit20;
        numOf50 += deposit50;
        numOf100 += deposit100;
    }

    // Метод, выводящий количество банкнот в банкомате.
    void displayBanknotes() {
        System.out.println("The number of 20 banknotes is: " + numOf20);
        System.out.println("The number of 50 banknotes is: " + numOf50);
        System.out.println("The number of 100 banknotes is: " + numOf100);
    }

    // Метод для снятия денег.
    boolean withdrawCash(int amoutToWithdraw) {
        boolean isSuccessful = false;
        if (amoutToWithdraw % 100 == 0) {
            if (amoutToWithdraw / 100 <= numOf100)
                isSuccessful = true;
        }
        if ((amoutToWithdraw % 100) % 50 == 0) {
            if ((amoutToWithdraw % 100) / 50 <= numOf50) {
                isSuccessful = true;
            }

        if (((amoutToWithdraw % 100) % 50) % 20 == 0) {
                if (amoutToWithdraw <= numOf20 * 20) {
                    isSuccessful = true;
                }
            }
        }
        return isSuccessful;
    }
}
