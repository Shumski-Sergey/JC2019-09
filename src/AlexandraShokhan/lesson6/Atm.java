package AlexandraShokhan.lesson6;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        // Создаем банкомат.
        AverageAtm BelarusbankAtm = new AverageAtm(30,60,98);
        // Добавляем купюры.
        BelarusbankAtm.depositCash(30,0,7);
        BelarusbankAtm.displayBanknotes();

        Scanner in = new Scanner(System.in);
        System.out.println("How much cash would you like to withdraw?");
        int amountToWithdraw = in.nextInt();

       if (BelarusbankAtm.withdrawCash(amountToWithdraw) == true) {
            System.out.println("The operation completed successfully.");
        } else {
           System.out.println("You can try again.");
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
        int a = amoutToWithdraw / 100;
        int b = (amoutToWithdraw % 100) / 50;
        int c = ((amoutToWithdraw % 100) % 50) / 20;
        if (((amoutToWithdraw % 100) % 50) % 20 == 0) {
            if (a <= numOf100 && b <= numOf50 && c <= numOf20) {
                isSuccessful = true;
                System.out.println("The number of 100 banknotes is " + a);
                System.out.println("The number of 50 banknotes is " + b);
                System.out.println("The number of 20 banknotes is " + c);
            } else {
                System.out.println("There is not enough banknotes in the ATM. Try to request a different amount.");
            }
        } else {
            System.out.println("The requested amount cannot be withdrawn in full since the available banknotes are only 100, 50, and 20.");
        }
        return isSuccessful;
    }
}